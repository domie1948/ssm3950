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
 * 水表
 *
 * @author 
 * @email
 * @date 2021-04-23
 */
@TableName("shuibiao")
public class ShuibiaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShuibiaoEntity() {

	}

	public ShuibiaoEntity(T t) {
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
     * 水表编号
     */
    @TableField(value = "shuibiao_number")

    private String shuibiaoNumber;


    /**
     * 水表余额
     */
    @TableField(value = "shuibiao_money")

    private Double shuibiaoMoney;


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
	 * 设置：水表编号
	 */
    public String getShuibiaoNumber() {
        return shuibiaoNumber;
    }


    /**
	 * 获取：水表编号
	 */

    public void setShuibiaoNumber(String shuibiaoNumber) {
        this.shuibiaoNumber = shuibiaoNumber;
    }
    /**
	 * 设置：水表余额
	 */
    public Double getShuibiaoMoney() {
        return shuibiaoMoney;
    }


    /**
	 * 获取：水表余额
	 */

    public void setShuibiaoMoney(Double shuibiaoMoney) {
        this.shuibiaoMoney = shuibiaoMoney;
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
        return "Shuibiao{" +
            "id=" + id +
            ", susheId=" + susheId +
            ", shuibiaoNumber=" + shuibiaoNumber +
            ", shuibiaoMoney=" + shuibiaoMoney +
            ", createTime=" + createTime +
        "}";
    }
}
