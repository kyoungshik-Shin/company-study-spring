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
    @Column(name = "ID")
    private int id;
    @Column(name = "SKU")
    private long sku;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "AVAILABLESIZES")
    private String availableSizes;
    @Column(name = "STYLE")
    private String style;
    @Column(name = "PRICE")
    private int price;
    @Column(name = "INSTALLMENTS")
    private int installments;
    @Column(name = "CURRENCYID")
    private String currencyId;
    @Column(name = "CURRENCYFORMAT")
    private String currencyFormat;
}
