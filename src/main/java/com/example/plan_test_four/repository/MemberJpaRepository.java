package com.example.plan_test_four.repository;

import com.example.plan_test_four.dto.GoodsDto;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MemberJpaRepository {
    private final EntityManager em;
    private final JPAQueryFactory queryFactory;
    public MemberJpaRepository(EntityManager em) {
        this.em = em;
        this.queryFactory = new JPAQueryFactory(em);
    }
    public void save(GoodsDto member) {
        em.persist(member);
    }
    public Optional<GoodsDto> findById(Long id) {
        GoodsDto findMember = em.find(GoodsDto.class, id);
        return Optional.ofNullable(findMember);
    }
    public List<GoodsDto> findAll() {
        return em.createQuery("select m from GoodsDto m", GoodsDto.class)
                 .getResultList();
    }
    public List<GoodsDto> findByUsername(String username) {
        return em.createQuery("select m from GoodsDto m where m.username= :username", GoodsDto.class)
            .setParameter("username", username)
            .getResultList();
    }
}
