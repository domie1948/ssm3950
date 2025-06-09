package com.entity.view;

import com.entity.DianbiaoJiaofeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 电表缴费
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-23
 */
@TableName("dianbiao_jiaofei")
public class DianbiaoJiaofeiView extends DianbiaoJiaofeiEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 dianbiao
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

	public DianbiaoJiaofeiView() {

	}

	public DianbiaoJiaofeiView(DianbiaoJiaofeiEntity dianbiaoJiaofeiEntity) {
		try {
			BeanUtils.copyProperties(this, dianbiaoJiaofeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}









				//级联表的get和set dianbiao
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
					* 获取： 电表编号
					*/
					public String getDianbiaoNumber() {
						return dianbiaoNumber;
					}
					/**
					* 设置： 电表编号
					*/
					public void setDianbiaoNumber(String dianbiaoNumber) {
						this.dianbiaoNumber = dianbiaoNumber;
					}
					/**
					* 获取： 电表余额
					*/
					public Double getDianbiaoMoney() {
						return dianbiaoMoney;
					}
					/**
					* 设置： 电表余额
					*/
					public void setDianbiaoMoney(Double dianbiaoMoney) {
						this.dianbiaoMoney = dianbiaoMoney;
					}
























}
