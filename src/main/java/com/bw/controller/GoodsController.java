package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.bw.entity.Goods;
import com.bw.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {

	@Resource
	private GoodsService service;
	
	@RequestMapping("/list")
	private String queryAll(Model model,@RequestParam(defaultValue="1") Integer pageNum,String pricestart,String priceend,String salesstart,String salesend){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("salesstart", salesstart);
		map.put("salesend", salesend);
		map.put("pricestart", pricestart);
		map.put("priceend", priceend);
		PageHelper.startPage(pageNum, 3);
		List<Goods> list=service.queryAll(map);
		PageInfo<Goods> page=new PageInfo<Goods>(list);
		model.addAttribute("page", page);
		model.addAttribute("list", list);
		return "list";
	}
}
