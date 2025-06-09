package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiwuzhaolingEntity;
import java.util.Map;

/**
 * 失物招领 服务类
 * @author 
 * @since 2021-05-04
 */
public interface ShiwuzhaolingService extends IService<ShiwuzhaolingEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}