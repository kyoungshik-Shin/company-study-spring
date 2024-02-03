package com.example.plan_test_four.controller;

import com.example.plan_test_four.dto.GoodsDto;
import com.example.plan_test_four.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/searchGoods")
    public Map<String, List<GoodsDto>> searchGoods() throws Exception{
        //DB에서 상품데이터 조회해서 가지고 오기.
        Map map = new HashMap();
        map.put("products", goodsService.searchGoods());
        return map;
    }
}
