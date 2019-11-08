package com.bw.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.entity.Goods;
import com.bw.mapper.Goodmapper;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Resource
	private Goodmapper mapper;
	
	public List<Goods> queryAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.queryAll(map);
	}

}
