package com.entity.model;

import com.entity.XiaochechaxunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 校车查询
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-05-04
 */
public class XiaochechaxunModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 校车编号
     */
    private String xiaochechaxunName;


    /**
     * 发车时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date xiaochechaxunTime;


    /**
     * 校车图片
     */
    private String xiaochechaxunPhoto;


    /**
     * 校车详情信息
     */
    private String xiaochechaxunContent;


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
	 * 获取：校车编号
	 */
    public String getXiaochechaxunName() {
        return xiaochechaxunName;
    }


    /**
	 * 设置：校车编号
	 */
    public void setXiaochechaxunName(String xiaochechaxunName) {
        this.xiaochechaxunName = xiaochechaxunName;
    }
    /**
	 * 获取：发车时间
	 */
    public Date getXiaochechaxunTime() {
        return xiaochechaxunTime;
    }


    /**
	 * 设置：发车时间
	 */
    public void setXiaochechaxunTime(Date xiaochechaxunTime) {
        this.xiaochechaxunTime = xiaochechaxunTime;
    }
    /**
	 * 获取：校车图片
	 */
    public String getXiaochechaxunPhoto() {
        return xiaochechaxunPhoto;
    }


    /**
	 * 设置：校车图片
	 */
    public void setXiaochechaxunPhoto(String xiaochechaxunPhoto) {
        this.xiaochechaxunPhoto = xiaochechaxunPhoto;
    }
    /**
	 * 获取：校车详情信息
	 */
    public String getXiaochechaxunContent() {
        return xiaochechaxunContent;
    }


    /**
	 * 设置：校车详情信息
	 */
    public void setXiaochechaxunContent(String xiaochechaxunContent) {
        this.xiaochechaxunContent = xiaochechaxunContent;
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
