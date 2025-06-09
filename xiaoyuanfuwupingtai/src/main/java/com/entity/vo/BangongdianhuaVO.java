package com.entity.vo;

import com.entity.BangongdianhuaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 教师办公电话
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-05-04
 */
@TableName("bangongdianhua")
public class BangongdianhuaVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow.
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow.
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow.
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
