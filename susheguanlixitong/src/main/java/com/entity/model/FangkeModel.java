package com.entity.model;

import com.entity.FangkeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 访客
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-23
 */
public class FangkeModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 访客姓名
     */
    private String fangkeName;


    /**
     * 访客手机号
     */
    private String fangkePhone;


    /**
     * 访客身份证号
     */
    private String fangkeIdNumber;


    /**
     * 温度
     */
    private String fangkeWendu;


    /**
     * 宿舍
     */
    private Integer susheId;


    /**
     * 来访事由
     */
    private String fangkeContent;


    /**
     * 来访日期
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
	 * 获取：访客姓名
	 */
    public String getFangkeName() {
        return fangkeName;
    }


    /**
	 * 设置：访客姓名
	 */
    public void setFangkeName(String fangkeName) {
        this.fangkeName = fangkeName;
    }
    /**
	 * 获取：访客手机号
	 */
    public String getFangkePhone() {
        return fangkePhone;
    }


    /**
	 * 设置：访客手机号
	 */
    public void setFangkePhone(String fangkePhone) {
        this.fangkePhone = fangkePhone;
    }
    /**
	 * 获取：访客身份证号
	 */
    public String getFangkeIdNumber() {
        return fangkeIdNumber;
    }


    /**
	 * 设置：访客身份证号
	 */
    public void setFangkeIdNumber(String fangkeIdNumber) {
        this.fangkeIdNumber = fangkeIdNumber;
    }
    /**
	 * 获取：温度
	 */
    public String getFangkeWendu() {
        return fangkeWendu;
    }


    /**
	 * 设置：温度
	 */
    public void setFangkeWendu(String fangkeWendu) {
        this.fangkeWendu = fangkeWendu;
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
	 * 获取：来访事由
	 */
    public String getFangkeContent() {
        return fangkeContent;
    }


    /**
	 * 设置：来访事由
	 */
    public void setFangkeContent(String fangkeContent) {
        this.fangkeContent = fangkeContent;
    }
    /**
	 * 获取：来访日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：来访日期
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
