package com.entity.model;

import com.entity.ShiwuzhaolingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 失物招领
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-05-04
 */
public class ShiwuzhaolingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 物品名称
     */
    private String shiwuzhaolingName;


    /**
     * 物品类型
     */
    private Integer shiwuzhaolingTypes;


    /**
     * 物品图片
     */
    private String shiwuzhaolingPhoto;


    /**
     * 获取地址
     */
    private String shiwuzhaolingDizhi;


    /**
     * 发布用户
     */
    private Integer yonghuId;


    /**
     * 价格
     */
    private Double shiwuzhaolingMoney;


    /**
     * 详情信息
     */
    private String shiwuzhaolingContent;


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
    public String getShiwuzhaolingName() {
        return shiwuzhaolingName;
    }


    /**
	 * 设置：物品名称
	 */
    public void setShiwuzhaolingName(String shiwuzhaolingName) {
        this.shiwuzhaolingName = shiwuzhaolingName;
    }
    /**
	 * 获取：物品类型
	 */
    public Integer getShiwuzhaolingTypes() {
        return shiwuzhaolingTypes;
    }


    /**
	 * 设置：物品类型
	 */
    public void setShiwuzhaolingTypes(Integer shiwuzhaolingTypes) {
        this.shiwuzhaolingTypes = shiwuzhaolingTypes;
    }
    /**
	 * 获取：物品图片
	 */
    public String getShiwuzhaolingPhoto() {
        return shiwuzhaolingPhoto;
    }


    /**
	 * 设置：物品图片
	 */
    public void setShiwuzhaolingPhoto(String shiwuzhaolingPhoto) {
        this.shiwuzhaolingPhoto = shiwuzhaolingPhoto;
    }
    /**
	 * 获取：获取地址
	 */
    public String getShiwuzhaolingDizhi() {
        return shiwuzhaolingDizhi;
    }


    /**
	 * 设置：获取地址
	 */
    public void setShiwuzhaolingDizhi(String shiwuzhaolingDizhi) {
        this.shiwuzhaolingDizhi = shiwuzhaolingDizhi;
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
    public Double getShiwuzhaolingMoney() {
        return shiwuzhaolingMoney;
    }


    /**
	 * 设置：价格
	 */
    public void setShiwuzhaolingMoney(Double shiwuzhaolingMoney) {
        this.shiwuzhaolingMoney = shiwuzhaolingMoney;
    }
    /**
	 * 获取：详情信息
	 */
    public String getShiwuzhaolingContent() {
        return shiwuzhaolingContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setShiwuzhaolingContent(String shiwuzhaolingContent) {
        this.shiwuzhaolingContent = shiwuzhaolingContent;
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
