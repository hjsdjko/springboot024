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
 * 玩具信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-06-05 15:25:59
 */
@TableName("wanjuxinxi")
public class WanjuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WanjuxinxiEntity() {
		
	}
	
	public WanjuxinxiEntity(T t) {
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
	 * 使用方法
	 */
					
	private String shiyongfangfa;
	
	/**
	 * 玩具详情
	 */
					
	private String wanjuxiangqing;
	
	/**
	 * 单限
	 */
					
	private Integer onelimittimes;
	
	/**
	 * 库存
	 */
					
	private Integer alllimittimes;
	
	/**
	 * 收藏数量
	 */
					
	private Integer storeupnum;
	
	/**
	 * 价格
	 */
					
	private Double price;
	
	
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
	 * 设置：使用方法
	 */
	public void setShiyongfangfa(String shiyongfangfa) {
		this.shiyongfangfa = shiyongfangfa;
	}
	/**
	 * 获取：使用方法
	 */
	public String getShiyongfangfa() {
		return shiyongfangfa;
	}
	/**
	 * 设置：玩具详情
	 */
	public void setWanjuxiangqing(String wanjuxiangqing) {
		this.wanjuxiangqing = wanjuxiangqing;
	}
	/**
	 * 获取：玩具详情
	 */
	public String getWanjuxiangqing() {
		return wanjuxiangqing;
	}
	/**
	 * 设置：单限
	 */
	public void setOnelimittimes(Integer onelimittimes) {
		this.onelimittimes = onelimittimes;
	}
	/**
	 * 获取：单限
	 */
	public Integer getOnelimittimes() {
		return onelimittimes;
	}
	/**
	 * 设置：库存
	 */
	public void setAlllimittimes(Integer alllimittimes) {
		this.alllimittimes = alllimittimes;
	}
	/**
	 * 获取：库存
	 */
	public Integer getAlllimittimes() {
		return alllimittimes;
	}
	/**
	 * 设置：收藏数量
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数量
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Double getPrice() {
		return price;
	}

}
