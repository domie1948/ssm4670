package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.WangzhanEntity;

import com.service.WangzhanService;
import com.entity.view.WangzhanView;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 网站管理员
 * 后端接口
 * @author
 * @email
 * @date 2021-05-05
*/
@RestController
@Controller
@RequestMapping("/wangzhan")
public class WangzhanController {
    private static final Logger logger = LoggerFactory.getLogger(WangzhanController.class);

    @Autowired
    private WangzhanService wangzhanService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
     
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "网站管理员".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = wangzhanService.queryPage(params);

        //字典表数据转换
        List<WangzhanView> list =(List<WangzhanView>)page.getList();
        for(WangzhanView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        WangzhanEntity wangzhan = wangzhanService.selectById(id);
        if(wangzhan !=null){
            //entity转view
            WangzhanView view = new WangzhanView();
            BeanUtils.copyProperties( wangzhan , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody WangzhanEntity wangzhan, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,wangzhan:{}",this.getClass().getName(),wangzhan.toString());
        Wrapper<WangzhanEntity> queryWrapper = new EntityWrapper<WangzhanEntity>()
            .eq("username", wangzhan.getUsername())
            .eq("password", wangzhan.getPassword())
            .eq("wangzhan_name", wangzhan.getWangzhanName())
            .eq("sex_types", wangzhan.getSexTypes())
            .eq("wangzhan_id_number", wangzhan.getWangzhanIdNumber())
            .eq("wangzhan_phone", wangzhan.getWangzhanPhone())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        WangzhanEntity wangzhanEntity = wangzhanService.selectOne(queryWrapper);
        if(wangzhanEntity==null){
            wangzhan.setCreateTime(new Date());
            wangzhan.setPassword("123456");
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      wangzhan.set
        //  }
            wangzhanService.insert(wangzhan);
            return R.ok();
        }else {
            return R.error(511,"账户或者身份证号或者手机号已经被使用");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody WangzhanEntity wangzhan, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,wangzhan:{}",this.getClass().getName(),wangzhan.toString());
        //根据字段查询是否有相同数据
        Wrapper<WangzhanEntity> queryWrapper = new EntityWrapper<WangzhanEntity>()
            .notIn("id",wangzhan.getId())
            .andNew()
            .eq("username", wangzhan.getUsername())
            .eq("password", wangzhan.getPassword())
            .eq("wangzhan_name", wangzhan.getWangzhanName())
            .eq("sex_types", wangzhan.getSexTypes())
            .eq("wangzhan_id_number", wangzhan.getWangzhanIdNumber())
            .eq("wangzhan_phone", wangzhan.getWangzhanPhone())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        WangzhanEntity wangzhanEntity = wangzhanService.selectOne(queryWrapper);
        if("".equals(wangzhan.getWangzhanPhoto()) || "null".equals(wangzhan.getWangzhanPhoto())){
                wangzhan.setWangzhanPhoto(null);
        }
        if(wangzhanEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      wangzhan.set
            //  }
            wangzhanService.updateById(wangzhan);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"账户或者身份证号或者手机号已经被使用");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        wangzhanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

    /**
    * 登录
    */
    @IgnoreAuth
    @RequestMapping(value = "/login")
    public R login(String username, String password, String captcha, HttpServletRequest request) {
        WangzhanEntity wangzhan = wangzhanService.selectOne(new EntityWrapper<WangzhanEntity>().eq("username", username));
        if(wangzhan==null || !wangzhan.getPassword().equals(password)) {
            return R.error("账号或密码不正确");
        }
        //  // 获取监听器中的字典表
        // ServletContext servletContext = ContextLoader.getCurrentWebApplicationContext().getServletContext();
        // Map<String, Map<Integer, String>> dictionaryMap= (Map<String, Map<Integer, String>>) servletContext.getAttribute("dictionaryMap");
        // Map<Integer, String> role_types = dictionaryMap.get("role_types");
        // role_types.get(yonghu.getRoleTypes());
        String token = tokenService.generateToken(wangzhan.getId(),username, "wangzhan", "网站管理员");
        R r = R.ok();
        r.put("token", token);
        r.put("role","网站管理员");
        r.put("username",wangzhan.getWangzhanName());
        r.put("tableName","wangzhan");
        r.put("userId",wangzhan.getId());
        return r;
    }

    /**
    * 注册
    */
    @IgnoreAuth
    @PostMapping(value = "/register")
    public R register(@RequestBody WangzhanEntity wangzhan){
    //    	ValidatorUtils.validateEntity(user);
        if(wangzhanService.selectOne(new EntityWrapper<WangzhanEntity>().eq("username", wangzhan.getUsername()).orNew().eq("wangzhan_phone",wangzhan.getWangzhanPhone()).orNew().eq("wangzhan_id_number",wangzhan.getWangzhanIdNumber())) !=null) {
            return R.error("账户已存在或手机号或身份证号已经被使用");
        }
        wangzhanService.insert(wangzhan);
        return R.ok();
    }

    /**
     * 重置密码
     */
    @GetMapping(value = "/resetPassword")
    public R resetPassword(Integer  id){
        WangzhanEntity wangzhan = new WangzhanEntity();
        wangzhan.setPassword("123456");
        wangzhan.setId(id);
        wangzhanService.updateById(wangzhan);
        return R.ok();
    }

    /**
    * 获取网站管理员的session网站管理员信息
    */
    @RequestMapping("/session")
    public R getCurrWangzhan(HttpServletRequest request){
        Integer id = (Integer)request.getSession().getAttribute("userId");
        WangzhanEntity wangzhan = wangzhanService.selectById(id);
        return R.ok().put("data", wangzhan);
    }


    /**
    * 退出
    */
    @GetMapping(value = "logout")
    public R logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return R.ok("退出成功");
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "网站管理员".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = wangzhanService.queryPage(params);

        //字典表数据转换
        List<WangzhanView> list =(List<WangzhanView>)page.getList();
        for(WangzhanView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        WangzhanEntity wangzhan = wangzhanService.selectById(id);
            if(wangzhan !=null){
                //entity转view
        WangzhanView view = new WangzhanView();
                BeanUtils.copyProperties( wangzhan , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody WangzhanEntity wangzhan, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,wangzhan:{}",this.getClass().getName(),wangzhan.toString());
        Wrapper<WangzhanEntity> queryWrapper = new EntityWrapper<WangzhanEntity>()
            .eq("username", wangzhan.getUsername())
            .eq("password", wangzhan.getPassword())
            .eq("wangzhan_name", wangzhan.getWangzhanName())
            .eq("sex_types", wangzhan.getSexTypes())
            .eq("wangzhan_id_number", wangzhan.getWangzhanIdNumber())
            .eq("wangzhan_phone", wangzhan.getWangzhanPhone())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
    WangzhanEntity wangzhanEntity = wangzhanService.selectOne(queryWrapper);
        if(wangzhanEntity==null){
            wangzhan.setCreateTime(new Date());
        wangzhan.setPassword("123456");
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      wangzhan.set
        //  }
        wangzhanService.insert(wangzhan);
            return R.ok();
        }else {
            return R.error(511,"账户或者身份证号或者手机号已经被使用");
        }
    }





}

