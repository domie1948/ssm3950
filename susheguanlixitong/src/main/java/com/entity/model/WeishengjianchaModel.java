package com.entity.model;

import com.entity.WeishengjianchaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 卫生检查
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-23
 */
public class WeishengjianchaModel implements Serializable {
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
     * 检查日期
     */
    private String weishengjianchaTime;


    /**
     * 检查结果
     */
    private Integer weishengjianchaTypes;


    /**
     * 备注
     */
    private String weishengjianchaContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：检查日期
	 */
    public String getWeishengjianchaTime() {
        return weishengjianchaTime;
    }


    /**
	 * 设置：检查日期
	 */
    public void setWeishengjianchaTime(String weishengjianchaTime) {
        this.weishengjianchaTime = weishengjianchaTime;
    }
    /**
	 * 获取：检查结果
	 */
    public Integer getWeishengjianchaTypes() {
        return weishengjianchaTypes;
    }


    /**
	 * 设置：检查结果
	 */
    public void setWeishengjianchaTypes(Integer weishengjianchaTypes) {
        this.weishengjianchaTypes = weishengjianchaTypes;
    }
    /**
	 * 获取：备注
	 */
    public String getWeishengjianchaContent() {
        return weishengjianchaContent;
    }


    /**
	 * 设置：备注
	 */
    public void setWeishengjianchaContent(String weishengjianchaContent) {
        this.weishengjianchaContent = weishengjianchaContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
