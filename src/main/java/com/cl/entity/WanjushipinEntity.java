package com.cl.entity;

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
 * 玩具视频
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-06-05 15:25:59
 */
@TableName("wanjushipin")
public class WanjushipinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WanjushipinEntity() {
		
	}
	
	public WanjushipinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 视频封面
	 */
					
	private String shipinfengmian;
	
	/**
	 * 视频标题
	 */
					
	private String shipinbiaoti;
	
	/**
	 * 视频类型
	 */
					
	private String shipinleixing;
	
	/**
	 * 视频
	 */
					
	private String shipin;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：视频封面
	 */
	public void setShipinfengmian(String shipinfengmian) {
		this.shipinfengmian = shipinfengmian;
	}
	/**
	 * 获取：视频封面
	 */
	public String getShipinfengmian() {
		return shipinfengmian;
	}
	/**
	 * 设置：视频标题
	 */
	public void setShipinbiaoti(String shipinbiaoti) {
		this.shipinbiaoti = shipinbiaoti;
	}
	/**
	 * 获取：视频标题
	 */
	public String getShipinbiaoti() {
		return shipinbiaoti;
	}
	/**
	 * 设置：视频类型
	 */
	public void setShipinleixing(String shipinleixing) {
		this.shipinleixing = shipinleixing;
	}
	/**
	 * 获取：视频类型
	 */
	public String getShipinleixing() {
		return shipinleixing;
	}
	/**
	 * 设置：视频
	 */
	public void setShipin(String shipin) {
		this.shipin = shipin;
	}
	/**
	 * 获取：视频
	 */
	public String getShipin() {
		return shipin;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}

}
