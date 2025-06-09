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

import com.dao.XiaochechaxunDao;
import com.entity.XiaochechaxunEntity;
import com.service.XiaochechaxunService;
import com.entity.view.XiaochechaxunView;

/**
 * 校车查询 服务实现类
 * @author 
 * @since 2021-05-04
 */
@Service("xiaochechaxunService")
@Transactional
public class XiaochechaxunServiceImpl extends ServiceImpl<XiaochechaxunDao, XiaochechaxunEntity> implements XiaochechaxunService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<XiaochechaxunView> page =new Query<XiaochechaxunView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
