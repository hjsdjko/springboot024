package com.cl.entity.view;

import com.cl.entity.WanjuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 玩具信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-06-05 15:25:59
 */
@TableName("wanjuxinxi")
public class WanjuxinxiView  extends WanjuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WanjuxinxiView(){
	}
 
 	public WanjuxinxiView(WanjuxinxiEntity wanjuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, wanjuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
