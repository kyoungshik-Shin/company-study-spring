package com.example.plan_test_four.service;

import com.example.plan_test_four.dto.GoodsDto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class GoodsServiceImpl implements GoodsService {
    @PersistenceContext
    EntityManager em;

    public List<GoodsDto> searchGoods(){
        List<GoodsDto> list = em.createQuery("select m from GoodsDto m", GoodsDto.class).getResultList();
        return list;
    }
}
