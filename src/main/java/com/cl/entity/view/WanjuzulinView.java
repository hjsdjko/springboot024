package com.cl.entity.view;

import com.cl.entity.WanjuzulinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 玩具租赁
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-06-05 15:26:00
 */
@TableName("wanjuzulin")
public class WanjuzulinView  extends WanjuzulinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WanjuzulinView(){
	}
 
 	public WanjuzulinView(WanjuzulinEntity wanjuzulinEntity){
 	try {
			BeanUtils.copyProperties(this, wanjuzulinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
