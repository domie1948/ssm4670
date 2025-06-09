package com.entity.model;

import com.entity.ErshouwupinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 二手物品
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-05-04
 */
public class ErshouwupinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 物品名称
     */
    private String ershouwupinName;


    /**
     * 物品类型
     */
    private Integer ershouwupinTypes;


    /**
     * 物品图片
     */
    private String ershouwupinPhoto;


    /**
     * 发布用户
     */
    private Integer yonghuId;


    /**
     * 价格
     */
    private Double ershouwupinMoney;


    /**
     * 详情信息
     */
    private String ershouwupinContent;


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
	 * 获取：物品名称
	 */
    public String getErshouwupinName() {
        return ershouwupinName;
    }


    /**
	 * 设置：物品名称
	 */
    public void setErshouwupinName(String ershouwupinName) {
        this.ershouwupinName = ershouwupinName;
    }
    /**
	 * 获取：物品类型
	 */
    public Integer getErshouwupinTypes() {
        return ershouwupinTypes;
    }


    /**
	 * 设置：物品类型
	 */
    public void setErshouwupinTypes(Integer ershouwupinTypes) {
        this.ershouwupinTypes = ershouwupinTypes;
    }
    /**
	 * 获取：物品图片
	 */
    public String getErshouwupinPhoto() {
        return ershouwupinPhoto;
    }


    /**
	 * 设置：物品图片
	 */
    public void setErshouwupinPhoto(String ershouwupinPhoto) {
        this.ershouwupinPhoto = ershouwupinPhoto;
    }
    /**
	 * 获取：发布用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：发布用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：价格
	 */
    public Double getErshouwupinMoney() {
        return ershouwupinMoney;
    }


    /**
	 * 设置：价格
	 */
    public void setErshouwupinMoney(Double ershouwupinMoney) {
        this.ershouwupinMoney = ershouwupinMoney;
    }
    /**
	 * 获取：详情信息
	 */
    public String getErshouwupinContent() {
        return ershouwupinContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setErshouwupinContent(String ershouwupinContent) {
        this.ershouwupinContent = ershouwupinContent;
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
