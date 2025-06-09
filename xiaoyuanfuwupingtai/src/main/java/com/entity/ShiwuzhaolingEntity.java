package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 失物招领
 *
 * @author 
 * @email
 * @date 2021-05-04
 */
@TableName("shiwuzhaoling")
public class ShiwuzhaolingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShiwuzhaolingEntity() {

	}

	public ShiwuzhaolingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 物品名称
     */
    @TableField(value = "shiwuzhaoling_name")

    private String shiwuzhaolingName;


    /**
     * 物品类型
     */
    @TableField(value = "shiwuzhaoling_types")

    private Integer shiwuzhaolingTypes;


    /**
     * 物品图片
     */
    @TableField(value = "shiwuzhaoling_photo")

    private String shiwuzhaolingPhoto;


    /**
     * 获取地址
     */
    @TableField(value = "shiwuzhaoling_dizhi")

    private String shiwuzhaolingDizhi;


    /**
     * 发布用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 价格
     */
    @TableField(value = "shiwuzhaoling_money")

    private Double shiwuzhaolingMoney;


    /**
     * 详情信息
     */
    @TableField(value = "shiwuzhaoling_content")

    private String shiwuzhaolingContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间   .
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：物品名称
	 */
    public String getShiwuzhaolingName() {
        return shiwuzhaolingName;
    }


    /**
	 * 获取：物品名称
	 */

    public void setShiwuzhaolingName(String shiwuzhaolingName) {
        this.shiwuzhaolingName = shiwuzhaolingName;
    }
    /**
	 * 设置：物品类型
	 */
    public Integer getShiwuzhaolingTypes() {
        return shiwuzhaolingTypes;
    }


    /**
	 * 获取：物品类型
	 */

    public void setShiwuzhaolingTypes(Integer shiwuzhaolingTypes) {
        this.shiwuzhaolingTypes = shiwuzhaolingTypes;
    }
    /**
	 * 设置：物品图片
	 */
    public String getShiwuzhaolingPhoto() {
        return shiwuzhaolingPhoto;
    }


    /**
	 * 获取：物品图片
	 */

    public void setShiwuzhaolingPhoto(String shiwuzhaolingPhoto) {
        this.shiwuzhaolingPhoto = shiwuzhaolingPhoto;
    }
    /**
	 * 设置：获取地址
	 */
    public String getShiwuzhaolingDizhi() {
        return shiwuzhaolingDizhi;
    }


    /**
	 * 获取：获取地址
	 */

    public void setShiwuzhaolingDizhi(String shiwuzhaolingDizhi) {
        this.shiwuzhaolingDizhi = shiwuzhaolingDizhi;
    }
    /**
	 * 设置：发布用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：发布用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：价格
	 */
    public Double getShiwuzhaolingMoney() {
        return shiwuzhaolingMoney;
    }


    /**
	 * 获取：价格
	 */

    public void setShiwuzhaolingMoney(Double shiwuzhaolingMoney) {
        this.shiwuzhaolingMoney = shiwuzhaolingMoney;
    }
    /**
	 * 设置：详情信息
	 */
    public String getShiwuzhaolingContent() {
        return shiwuzhaolingContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setShiwuzhaolingContent(String shiwuzhaolingContent) {
        this.shiwuzhaolingContent = shiwuzhaolingContent;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间   .
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间   .
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Shiwuzhaoling{" +
            "id=" + id +
            ", shiwuzhaolingName=" + shiwuzhaolingName +
            ", shiwuzhaolingTypes=" + shiwuzhaolingTypes +
            ", shiwuzhaolingPhoto=" + shiwuzhaolingPhoto +
            ", shiwuzhaolingDizhi=" + shiwuzhaolingDizhi +
            ", yonghuId=" + yonghuId +
            ", shiwuzhaolingMoney=" + shiwuzhaolingMoney +
            ", shiwuzhaolingContent=" + shiwuzhaolingContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
