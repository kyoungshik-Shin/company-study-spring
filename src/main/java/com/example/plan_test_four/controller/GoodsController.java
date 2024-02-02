package com.example.plan_test_four.controller;

import com.example.plan_test_four.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/searchGoods")
    public ModelAndView searchGoods() throws Exception{
        ModelAndView mv = new ModelAndView("/apple/boardList");
        //DB에서 상품데이터 조회해서 가지고 오기.
        mv.addObject("goodsList", goodsService.searchGoods());
        return mv;

    }
}
