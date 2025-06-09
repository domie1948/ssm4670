package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WangzhanEntity;
import java.util.Map;

/**
 * 网站管理员 服务类
 * @author 
 * @since 2021-05-04
 */
public interface WangzhanService extends IService<WangzhanEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}