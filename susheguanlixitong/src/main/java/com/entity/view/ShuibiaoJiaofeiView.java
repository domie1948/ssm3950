package com.entity.view;

import com.entity.ShuibiaoJiaofeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 水表缴费
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-23
 */
@TableName("shuibiao_jiaofei")
public class ShuibiaoJiaofeiView extends ShuibiaoJiaofeiEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 shuibiao
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

	public ShuibiaoJiaofeiView() {

	}

	public ShuibiaoJiaofeiView(ShuibiaoJiaofeiEntity shuibiaoJiaofeiEntity) {
		try {
			BeanUtils.copyProperties(this, shuibiaoJiaofeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





















				//级联表的get和set shuibiao
					/**
					* 获取： 宿舍
					*/
					public Integer getSusheId() {
						return susheId;
					}
					/**
					* 设置： 宿舍
					*/
					public void setSusheId(Integer susheId) {
						this.susheId = susheId;
					}
					/**
					* 获取： 水表编号
					*/
					public String getShuibiaoNumber() {
						return shuibiaoNumber;
					}
					/**
					* 设置： 水表编号
					*/
					public void setShuibiaoNumber(String shuibiaoNumber) {
						this.shuibiaoNumber = shuibiaoNumber;
					}
					/**
					* 获取： 水表余额
					*/
					public Double getShuibiaoMoney() {
						return shuibiaoMoney;
					}
					/**
					* 设置： 水表余额
					*/
					public void setShuibiaoMoney(Double shuibiaoMoney) {
						this.shuibiaoMoney = shuibiaoMoney;
					}












}
