package com.entity.model;

import com.entity.DianbiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 电表
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-23
 */
public class DianbiaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 宿舍
     */
    private Integer susheId;


    /**
     * 电表编号
     */
    private String dianbiaoNumber;


    /**
     * 电表余额
     */
    private Double dianbiaoMoney;


    /**
     * 创建时间
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
	 * 获取：宿舍
	 */
    public Integer getSusheId() {
        return susheId;
    }


    /**
	 * 设置：宿舍
	 */
    public void setSusheId(Integer susheId) {
        this.susheId = susheId;
    }
    /**
	 * 获取：电表编号
	 */
    public String getDianbiaoNumber() {
        return dianbiaoNumber;
    }


    /**
	 * 设置：电表编号
	 */
    public void setDianbiaoNumber(String dianbiaoNumber) {
        this.dianbiaoNumber = dianbiaoNumber;
    }
    /**
	 * 获取：电表余额
	 */
    public Double getDianbiaoMoney() {
        return dianbiaoMoney;
    }


    /**
	 * 设置：电表余额
	 */
    public void setDianbiaoMoney(Double dianbiaoMoney) {
        this.dianbiaoMoney = dianbiaoMoney;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
