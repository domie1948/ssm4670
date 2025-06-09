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
 * 教师办公电话
 *
 * @author 
 * @email
 * @date 2021-05-04
 */
@TableName("bangongdianhua")
public class BangongdianhuaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BangongdianhuaEntity() {

	}

	public BangongdianhuaEntity(T t) {
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
     * 教师名称
     */
    @TableField(value = "bangongdianhua_name")

    private String bangongdianhuaName;


    /**
     * 教师部门
     */
    @TableField(value = "bangongdianhua_types")

    private Integer bangongdianhuaTypes;


    /**
     * 教师联系方式
     */
    @TableField(value = "bangongdianhua_phone")

    private String bangongdianhuaPhone;


    /**
     * 教师头像
     */
    @TableField(value = "bangongdianhua_photo")

    private String bangongdianhuaPhoto;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 价格
     */
    @TableField(value = "bangongdianhua_money")

    private Double bangongdianhuaMoney;


    /**
     * 教师详情
     */
    @TableField(value = "bangongdianhua_content")

    private String bangongdianhuaContent;


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
	 * 设置：教师名称
	 */
    public String getBangongdianhuaName() {
        return bangongdianhuaName;
    }


    /**
	 * 获取：教师名称
	 */

    public void setBangongdianhuaName(String bangongdianhuaName) {
        this.bangongdianhuaName = bangongdianhuaName;
    }
    /**
	 * 设置：教师部门
	 */
    public Integer getBangongdianhuaTypes() {
        return bangongdianhuaTypes;
    }


    /**
	 * 获取：教师部门
	 */

    public void setBangongdianhuaTypes(Integer bangongdianhuaTypes) {
        this.bangongdianhuaTypes = bangongdianhuaTypes;
    }
    /**
	 * 设置：教师联系方式
	 */
    public String getBangongdianhuaPhone() {
        return bangongdianhuaPhone;
    }


    /**
	 * 获取：教师联系方式
	 */

    public void setBangongdianhuaPhone(String bangongdianhuaPhone) {
        this.bangongdianhuaPhone = bangongdianhuaPhone;
    }
    /**
	 * 设置：教师头像
	 */
    public String getBangongdianhuaPhoto() {
        return bangongdianhuaPhoto;
    }


    /**
	 * 获取：教师头像
	 */

    public void setBangongdianhuaPhoto(String bangongdianhuaPhoto) {
        this.bangongdianhuaPhoto = bangongdianhuaPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：价格
	 */
    public Double getBangongdianhuaMoney() {
        return bangongdianhuaMoney;
    }


    /**
	 * 获取：价格
	 */

    public void setBangongdianhuaMoney(Double bangongdianhuaMoney) {
        this.bangongdianhuaMoney = bangongdianhuaMoney;
    }
    /**
	 * 设置：教师详情
	 */
    public String getBangongdianhuaContent() {
        return bangongdianhuaContent;
    }


    /**
	 * 获取：教师详情
	 */

    public void setBangongdianhuaContent(String bangongdianhuaContent) {
        this.bangongdianhuaContent = bangongdianhuaContent;
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
        return "Bangongdianhua{" +
            "id=" + id +
            ", bangongdianhuaName=" + bangongdianhuaName +
            ", bangongdianhuaTypes=" + bangongdianhuaTypes +
            ", bangongdianhuaPhone=" + bangongdianhuaPhone +
            ", bangongdianhuaPhoto=" + bangongdianhuaPhoto +
            ", sexTypes=" + sexTypes +
            ", bangongdianhuaMoney=" + bangongdianhuaMoney +
            ", bangongdianhuaContent=" + bangongdianhuaContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
