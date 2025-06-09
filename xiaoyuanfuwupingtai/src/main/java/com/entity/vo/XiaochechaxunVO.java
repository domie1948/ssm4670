package com.entity.vo;

import com.entity.XiaochechaxunEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 校车查询
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-05-04
 */
@TableName("xiaochechaxun")
public class XiaochechaxunVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 校车编号
     */

    @TableField(value = "xiaochechaxun_name")
    private String xiaochechaxunName;


    /**
     * 发车时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "xiaochechaxun_time")
    private Date xiaochechaxunTime;


    /**
     * 校车图片
     */

    @TableField(value = "xiaochechaxun_photo")
    private String xiaochechaxunPhoto;


    /**
     * 校车详情信息
     */

    @TableField(value = "xiaochechaxun_content")
    private String xiaochechaxunContent;


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
	 * 设置：校车编号
	 */
    public String getXiaochechaxunName() {
        return xiaochechaxunName;
    }


    /**
	 * 获取：校车编号
	 */

    public void setXiaochechaxunName(String xiaochechaxunName) {
        this.xiaochechaxunName = xiaochechaxunName;
    }
    /**
	 * 设置：发车时间
	 */
    public Date getXiaochechaxunTime() {
        return xiaochechaxunTime;
    }


    /**
	 * 获取：发车时间
	 */

    public void setXiaochechaxunTime(Date xiaochechaxunTime) {
        this.xiaochechaxunTime = xiaochechaxunTime;
    }
    /**
	 * 设置：校车图片
	 */
    public String getXiaochechaxunPhoto() {
        return xiaochechaxunPhoto;
    }


    /**
	 * 获取：校车图片
	 */

    public void setXiaochechaxunPhoto(String xiaochechaxunPhoto) {
        this.xiaochechaxunPhoto = xiaochechaxunPhoto;
    }
    /**
	 * 设置：校车详情信息
	 */
    public String getXiaochechaxunContent() {
        return xiaochechaxunContent;
    }


    /**
	 * 获取：校车详情信息
	 */

    public void setXiaochechaxunContent(String xiaochechaxunContent) {
        this.xiaochechaxunContent = xiaochechaxunContent;
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
