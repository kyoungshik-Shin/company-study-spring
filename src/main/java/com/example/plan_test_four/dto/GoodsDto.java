package com.example.plan_test_four.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "GOODS")
public class GoodsDto {
    @Id
    @GeneratedValue
    @Column(name = "GOODS_ID")
    private String id;
    @Column(name = "GOODS_NM")
    private String goodsNm;
    private int qty;
    private int amt;

    public GoodsDto(String goodsName){
        this(goodsName, 0);
    }

    public GoodsDto(String goodsNm, int qty){
        this(goodsNm, qty, 0);
    }

    public GoodsDto(String goodsNm, int qty, int amt){
        this.goodsNm = goodsNm;
        this.qty = qty;
        this.amt = amt;
    }

}
