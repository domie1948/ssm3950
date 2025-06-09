package com.entity.model;

import com.entity.ShuibiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 水表
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-23
 */
public class ShuibiaoModel implements Serializable {
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
     * 水表编号
     */
    private String shuibiaoNumber;


    /**
     * 水表余额
     */
    private Double shuibiaoMoney;


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
	 * 获取：水表编号
	 */
    public String getShuibiaoNumber() {
        return shuibiaoNumber;
    }


    /**
	 * 设置：水表编号
	 */
    public void setShuibiaoNumber(String shuibiaoNumber) {
        this.shuibiaoNumber = shuibiaoNumber;
    }
    /**
	 * 获取：水表余额
	 */
    public Double getShuibiaoMoney() {
        return shuibiaoMoney;
    }


    /**
	 * 设置：水表余额
	 */
    public void setShuibiaoMoney(Double shuibiaoMoney) {
        this.shuibiaoMoney = shuibiaoMoney;
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
