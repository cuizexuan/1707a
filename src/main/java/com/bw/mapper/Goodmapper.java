package com.bw.mapper;

import java.util.List;
import java.util.Map;

import com.bw.entity.Goods;

public interface Goodmapper {

	List<Goods> queryAll(Map<String, Object> map);

}
