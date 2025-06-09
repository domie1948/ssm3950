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
 * 卫生检查
 *
 * @author 
 * @email
 * @date 2021-04-23
 */
@TableName("weishengjiancha")
public class WeishengjianchaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public WeishengjianchaEntity() {

	}

	public WeishengjianchaEntity(T t) {
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
     * 宿舍
     */
    @TableField(value = "sushe_id")

    private Integer susheId;


    /**
     * 检查日期
     */
    @TableField(value = "weishengjiancha_time",fill = FieldFill.UPDATE)

    private String weishengjianchaTime;


    /**
     * 检查结果
     */
    @TableField(value = "weishengjiancha_types")

    private Integer weishengjianchaTypes;


    /**
     * 备注
     */
    @TableField(value = "weishengjiancha_content")

    private String weishengjianchaContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
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
	 * 设置：宿舍
	 */
    public Integer getSusheId() {
        return susheId;
    }


    /**
	 * 获取：宿舍
	 */

    public void setSusheId(Integer susheId) {
        this.susheId = susheId;
    }
    /**
	 * 设置：检查日期
	 */
    public String getWeishengjianchaTime() {
        return weishengjianchaTime;
    }


    /**
	 * 获取：检查日期
	 */

    public void setWeishengjianchaTime(String weishengjianchaTime) {
        this.weishengjianchaTime = weishengjianchaTime;
    }
    /**
	 * 设置：检查结果
	 */
    public Integer getWeishengjianchaTypes() {
        return weishengjianchaTypes;
    }


    /**
	 * 获取：检查结果
	 */

    public void setWeishengjianchaTypes(Integer weishengjianchaTypes) {
        this.weishengjianchaTypes = weishengjianchaTypes;
    }
    /**
	 * 设置：备注
	 */
    public String getWeishengjianchaContent() {
        return weishengjianchaContent;
    }


    /**
	 * 获取：备注
	 */

    public void setWeishengjianchaContent(String weishengjianchaContent) {
        this.weishengjianchaContent = weishengjianchaContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Weishengjiancha{" +
            "id=" + id +
            ", susheId=" + susheId +
            ", weishengjianchaTime=" + weishengjianchaTime +
            ", weishengjianchaTypes=" + weishengjianchaTypes +
            ", weishengjianchaContent=" + weishengjianchaContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
