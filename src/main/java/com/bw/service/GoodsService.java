package com.bw.service;

import java.util.List;
import java.util.Map;

import com.bw.entity.Goods;

public interface GoodsService {

	List<Goods> queryAll(Map<String, Object> map);

}
