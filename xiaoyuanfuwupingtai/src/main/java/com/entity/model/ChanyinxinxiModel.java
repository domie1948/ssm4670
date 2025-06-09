package com.entity.model;

import com.entity.ChanyinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 餐饮信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-05-04
 */
public class ChanyinxinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 菜品名称
     */
    private String chanyinxinxiName;


    /**
     * 菜品图片
     */
    private String chanyinxinxiPhoto;


    /**
     * 菜品价格
     */
    private Double chanyinxinxiMoney;


    /**
     * 详情信息
     */
    private String chanyinxinxiContent;


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
	 * 获取：菜品名称
	 */
    public String getChanyinxinxiName() {
        return chanyinxinxiName;
    }


    /**
	 * 设置：菜品名称
	 */
    public void setChanyinxinxiName(String chanyinxinxiName) {
        this.chanyinxinxiName = chanyinxinxiName;
    }
    /**
	 * 获取：菜品图片
	 */
    public String getChanyinxinxiPhoto() {
        return chanyinxinxiPhoto;
    }


    /**
	 * 设置：菜品图片
	 */
    public void setChanyinxinxiPhoto(String chanyinxinxiPhoto) {
        this.chanyinxinxiPhoto = chanyinxinxiPhoto;
    }
    /**
	 * 获取：菜品价格
	 */
    public Double getChanyinxinxiMoney() {
        return chanyinxinxiMoney;
    }


    /**
	 * 设置：菜品价格
	 */
    public void setChanyinxinxiMoney(Double chanyinxinxiMoney) {
        this.chanyinxinxiMoney = chanyinxinxiMoney;
    }
    /**
	 * 获取：详情信息
	 */
    public String getChanyinxinxiContent() {
        return chanyinxinxiContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setChanyinxinxiContent(String chanyinxinxiContent) {
        this.chanyinxinxiContent = chanyinxinxiContent;
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
