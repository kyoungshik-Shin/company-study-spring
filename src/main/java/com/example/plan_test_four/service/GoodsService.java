package com.example.plan_test_four.service;

import com.example.plan_test_four.dto.GoodsDto;
import com.example.plan_test_four.dto.TestDto;

import java.util.List;

public interface GoodsService {
    List<GoodsDto> searchGoods() throws Exception;

}
