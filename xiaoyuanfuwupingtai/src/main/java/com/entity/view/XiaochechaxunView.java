package com.entity.view;

import com.entity.XiaochechaxunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 校车查询
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-05-04
 */
@TableName("xiaochechaxun")
public class XiaochechaxunView extends XiaochechaxunEntity implements Serializable {
    private static final long serialVersionUID = 1L;



	public XiaochechaxunView() {

	}

	public XiaochechaxunView(XiaochechaxunEntity xiaochechaxunEntity) {
		try {
			BeanUtils.copyProperties(this, xiaochechaxunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}















}
