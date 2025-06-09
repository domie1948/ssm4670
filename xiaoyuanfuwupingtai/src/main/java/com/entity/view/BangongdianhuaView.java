package com.entity.view;

import com.entity.BangongdianhuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 教师办公电话
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-05-04
 */
@TableName("bangongdianhua")
public class BangongdianhuaView extends BangongdianhuaEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 教师部门的值
		*/
		private String bangongdianhuaValue;
		/**
		* 性别的值
		*/
		private String sexValue;



	public BangongdianhuaView() {

	}

	public BangongdianhuaView(BangongdianhuaEntity bangongdianhuaEntity) {
		try {
			BeanUtils.copyProperties(this, bangongdianhuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 教师部门的值
			*/
			public String getBangongdianhuaValue() {
				return bangongdianhuaValue;
			}
			/**
			* 设置： 教师部门的值
			*/
			public void setBangongdianhuaValue(String bangongdianhuaValue) {
				this.bangongdianhuaValue = bangongdianhuaValue;
			}
			/**
			* 获取： 性别的值
			*/
			public String getSexValue() {
				return sexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
			}












}
