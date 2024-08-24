package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.WanjuzulinEntity;
import com.cl.entity.view.WanjuzulinView;

import com.cl.service.WanjuzulinService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 玩具租赁
 * 后端接口
 * @author 
 * @email 
 * @date 2024-06-05 15:26:00
 */
@RestController
@RequestMapping("/wanjuzulin")
public class WanjuzulinController {
    @Autowired
    private WanjuzulinService wanjuzulinService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WanjuzulinEntity wanjuzulin,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wanjuzulin.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WanjuzulinEntity> ew = new EntityWrapper<WanjuzulinEntity>();

		PageUtils page = wanjuzulinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wanjuzulin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WanjuzulinEntity wanjuzulin, 
		HttpServletRequest request){
        EntityWrapper<WanjuzulinEntity> ew = new EntityWrapper<WanjuzulinEntity>();

		PageUtils page = wanjuzulinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wanjuzulin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WanjuzulinEntity wanjuzulin){
       	EntityWrapper<WanjuzulinEntity> ew = new EntityWrapper<WanjuzulinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wanjuzulin, "wanjuzulin")); 
        return R.ok().put("data", wanjuzulinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WanjuzulinEntity wanjuzulin){
        EntityWrapper< WanjuzulinEntity> ew = new EntityWrapper< WanjuzulinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wanjuzulin, "wanjuzulin")); 
		WanjuzulinView wanjuzulinView =  wanjuzulinService.selectView(ew);
		return R.ok("查询玩具租赁成功").put("data", wanjuzulinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WanjuzulinEntity wanjuzulin = wanjuzulinService.selectById(id);
		wanjuzulin = wanjuzulinService.selectView(new EntityWrapper<WanjuzulinEntity>().eq("id", id));
        return R.ok().put("data", wanjuzulin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WanjuzulinEntity wanjuzulin = wanjuzulinService.selectById(id);
		wanjuzulin = wanjuzulinService.selectView(new EntityWrapper<WanjuzulinEntity>().eq("id", id));
        return R.ok().put("data", wanjuzulin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WanjuzulinEntity wanjuzulin, HttpServletRequest request){
    	wanjuzulin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wanjuzulin);
        wanjuzulinService.insert(wanjuzulin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WanjuzulinEntity wanjuzulin, HttpServletRequest request){
    	wanjuzulin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wanjuzulin);
        wanjuzulinService.insert(wanjuzulin);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WanjuzulinEntity wanjuzulin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wanjuzulin);
        wanjuzulinService.updateById(wanjuzulin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wanjuzulinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
