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
 * 玩具租赁
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-06-05 15:26:00
 */
@TableName("wanjuzulin")
public class WanjuzulinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WanjuzulinEntity() {
		
	}
	
	public WanjuzulinEntity(T t) {
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
	 * 玩具图片
	 */
					
	private String wanjutupian;
	
	/**
	 * 玩具名称
	 */
					
	private String wanjumingcheng;
	
	/**
	 * 玩具分类
	 */
					
	private String wanjufenlei;
	
	/**
	 * 玩具材质
	 */
					
	private String wanjucaizhi;
	
	/**
	 * 玩具品牌
	 */
					
	private String wanjupinpai;
	
	/**
	 * 租赁价格
	 */
					
	private Double zulinjiage;
	
	/**
	 * 合适年龄
	 */
					
	private Integer heshinianling;
	
	/**
	 * 租赁时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date zulinshijian;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	
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
	 * 设置：玩具图片
	 */
	public void setWanjutupian(String wanjutupian) {
		this.wanjutupian = wanjutupian;
	}
	/**
	 * 获取：玩具图片
	 */
	public String getWanjutupian() {
		return wanjutupian;
	}
	/**
	 * 设置：玩具名称
	 */
	public void setWanjumingcheng(String wanjumingcheng) {
		this.wanjumingcheng = wanjumingcheng;
	}
	/**
	 * 获取：玩具名称
	 */
	public String getWanjumingcheng() {
		return wanjumingcheng;
	}
	/**
	 * 设置：玩具分类
	 */
	public void setWanjufenlei(String wanjufenlei) {
		this.wanjufenlei = wanjufenlei;
	}
	/**
	 * 获取：玩具分类
	 */
	public String getWanjufenlei() {
		return wanjufenlei;
	}
	/**
	 * 设置：玩具材质
	 */
	public void setWanjucaizhi(String wanjucaizhi) {
		this.wanjucaizhi = wanjucaizhi;
	}
	/**
	 * 获取：玩具材质
	 */
	public String getWanjucaizhi() {
		return wanjucaizhi;
	}
	/**
	 * 设置：玩具品牌
	 */
	public void setWanjupinpai(String wanjupinpai) {
		this.wanjupinpai = wanjupinpai;
	}
	/**
	 * 获取：玩具品牌
	 */
	public String getWanjupinpai() {
		return wanjupinpai;
	}
	/**
	 * 设置：租赁价格
	 */
	public void setZulinjiage(Double zulinjiage) {
		this.zulinjiage = zulinjiage;
	}
	/**
	 * 获取：租赁价格
	 */
	public Double getZulinjiage() {
		return zulinjiage;
	}
	/**
	 * 设置：合适年龄
	 */
	public void setHeshinianling(Integer heshinianling) {
		this.heshinianling = heshinianling;
	}
	/**
	 * 获取：合适年龄
	 */
	public Integer getHeshinianling() {
		return heshinianling;
	}
	/**
	 * 设置：租赁时间
	 */
	public void setZulinshijian(Date zulinshijian) {
		this.zulinshijian = zulinshijian;
	}
	/**
	 * 获取：租赁时间
	 */
	public Date getZulinshijian() {
		return zulinshijian;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}

}
