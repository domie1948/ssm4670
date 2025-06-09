package com.entity.model;

import com.entity.BangongdianhuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 教师办公电话
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-05-04
 */
public class BangongdianhuaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 教师名称
     */
    private String bangongdianhuaName;


    /**
     * 教师部门
     */
    private Integer bangongdianhuaTypes;


    /**
     * 教师联系方式
     */
    private String bangongdianhuaPhone;


    /**
     * 教师头像
     */
    private String bangongdianhuaPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 价格
     */
    private Double bangongdianhuaMoney;


    /**
     * 教师详情
     */
    private String bangongdianhuaContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow.
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：教师名称
	 */
    public String getBangongdianhuaName() {
        return bangongdianhuaName;
    }


    /**
	 * 设置：教师名称
	 */
    public void setBangongdianhuaName(String bangongdianhuaName) {
        this.bangongdianhuaName = bangongdianhuaName;
    }
    /**
	 * 获取：教师部门
	 */
    public Integer getBangongdianhuaTypes() {
        return bangongdianhuaTypes;
    }


    /**
	 * 设置：教师部门
	 */
    public void setBangongdianhuaTypes(Integer bangongdianhuaTypes) {
        this.bangongdianhuaTypes = bangongdianhuaTypes;
    }
    /**
	 * 获取：教师联系方式
	 */
    public String getBangongdianhuaPhone() {
        return bangongdianhuaPhone;
    }


    /**
	 * 设置：教师联系方式
	 */
    public void setBangongdianhuaPhone(String bangongdianhuaPhone) {
        this.bangongdianhuaPhone = bangongdianhuaPhone;
    }
    /**
	 * 获取：教师头像
	 */
    public String getBangongdianhuaPhoto() {
        return bangongdianhuaPhoto;
    }


    /**
	 * 设置：教师头像
	 */
    public void setBangongdianhuaPhoto(String bangongdianhuaPhoto) {
        this.bangongdianhuaPhoto = bangongdianhuaPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：价格
	 */
    public Double getBangongdianhuaMoney() {
        return bangongdianhuaMoney;
    }


    /**
	 * 设置：价格
	 */
    public void setBangongdianhuaMoney(Double bangongdianhuaMoney) {
        this.bangongdianhuaMoney = bangongdianhuaMoney;
    }
    /**
	 * 获取：教师详情
	 */
    public String getBangongdianhuaContent() {
        return bangongdianhuaContent;
    }


    /**
	 * 设置：教师详情
	 */
    public void setBangongdianhuaContent(String bangongdianhuaContent) {
        this.bangongdianhuaContent = bangongdianhuaContent;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow.
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow.
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
