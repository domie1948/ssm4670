package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaochechaxunEntity;
import java.util.Map;

/**
 * 校车查询 服务类
 * @author 
 * @since 2021-05-04
 */
public interface XiaochechaxunService extends IService<XiaochechaxunEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}