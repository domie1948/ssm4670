package com.entity.view;

import com.entity.ChanyinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 餐饮信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-05-04
 */
@TableName("chanyinxinxi")
public class ChanyinxinxiView extends ChanyinxinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;



	public ChanyinxinxiView() {

	}

	public ChanyinxinxiView(ChanyinxinxiEntity chanyinxinxiEntity) {
		try {
			BeanUtils.copyProperties(this, chanyinxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}















}
