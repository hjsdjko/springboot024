package com.cl.entity.view;

import com.cl.entity.WanjufenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 玩具分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-06-05 15:25:59
 */
@TableName("wanjufenlei")
public class WanjufenleiView  extends WanjufenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WanjufenleiView(){
	}
 
 	public WanjufenleiView(WanjufenleiEntity wanjufenleiEntity){
 	try {
			BeanUtils.copyProperties(this, wanjufenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
