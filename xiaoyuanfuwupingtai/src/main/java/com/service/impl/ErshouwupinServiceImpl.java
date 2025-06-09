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

import com.dao.ErshouwupinDao;
import com.entity.ErshouwupinEntity;
import com.service.ErshouwupinService;
import com.entity.view.ErshouwupinView;

/**
 * 二手物品 服务实现类
 * @author 
 * @since 2021-05-04
 */
@Service("ershouwupinService")
@Transactional
public class ErshouwupinServiceImpl extends ServiceImpl<ErshouwupinDao, ErshouwupinEntity> implements ErshouwupinService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ErshouwupinView> page =new Query<ErshouwupinView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
