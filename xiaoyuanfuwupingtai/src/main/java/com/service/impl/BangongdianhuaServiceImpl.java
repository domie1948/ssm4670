package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.BangongdianhuaDao;
import com.entity.BangongdianhuaEntity;
import com.service.BangongdianhuaService;
import com.entity.view.BangongdianhuaView;

/**
 * 教师办公电话 服务实现类
 * @author 
 * @since 2021-05-04
 */
@Service("bangongdianhuaService")
@Transactional
public class BangongdianhuaServiceImpl extends ServiceImpl<BangongdianhuaDao, BangongdianhuaEntity> implements BangongdianhuaService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<BangongdianhuaView> page =new Query<BangongdianhuaView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
