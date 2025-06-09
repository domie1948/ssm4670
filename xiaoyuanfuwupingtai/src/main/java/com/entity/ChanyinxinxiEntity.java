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
 * 餐饮信息
 *
 * @author 
 * @email
 * @date 2021-05-04
 */
@TableName("chanyinxinxi")
public class ChanyinxinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChanyinxinxiEntity() {

	}

	public ChanyinxinxiEntity(T t) {
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
     * 菜品名称
     */
    @TableField(value = "chanyinxinxi_name")

    private String chanyinxinxiName;


    /**
     * 菜品图片
     */
    @TableField(value = "chanyinxinxi_photo")

    private String chanyinxinxiPhoto;


    /**
     * 菜品价格
     */
    @TableField(value = "chanyinxinxi_money")

    private Double chanyinxinxiMoney;


    /**
     * 详情信息
     */
    @TableField(value = "chanyinxinxi_content")

    private String chanyinxinxiContent;


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
	 * 设置：菜品名称
	 */
    public String getChanyinxinxiName() {
        return chanyinxinxiName;
    }


    /**
	 * 获取：菜品名称
	 */

    public void setChanyinxinxiName(String chanyinxinxiName) {
        this.chanyinxinxiName = chanyinxinxiName;
    }
    /**
	 * 设置：菜品图片
	 */
    public String getChanyinxinxiPhoto() {
        return chanyinxinxiPhoto;
    }


    /**
	 * 获取：菜品图片
	 */

    public void setChanyinxinxiPhoto(String chanyinxinxiPhoto) {
        this.chanyinxinxiPhoto = chanyinxinxiPhoto;
    }
    /**
	 * 设置：菜品价格
	 */
    public Double getChanyinxinxiMoney() {
        return chanyinxinxiMoney;
    }


    /**
	 * 获取：菜品价格
	 */

    public void setChanyinxinxiMoney(Double chanyinxinxiMoney) {
        this.chanyinxinxiMoney = chanyinxinxiMoney;
    }
    /**
	 * 设置：详情信息
	 */
    public String getChanyinxinxiContent() {
        return chanyinxinxiContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setChanyinxinxiContent(String chanyinxinxiContent) {
        this.chanyinxinxiContent = chanyinxinxiContent;
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
        return "Chanyinxinxi{" +
            "id=" + id +
            ", chanyinxinxiName=" + chanyinxinxiName +
            ", chanyinxinxiPhoto=" + chanyinxinxiPhoto +
            ", chanyinxinxiMoney=" + chanyinxinxiMoney +
            ", chanyinxinxiContent=" + chanyinxinxiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
