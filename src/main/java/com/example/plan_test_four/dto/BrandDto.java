package com.example.plan_test_four.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "BRAND")

public class BrandDto {
    @Id
    @GeneratedValue
    @Column(name = "BRAND_ID")
    private Long id;
    @Column(name = "BRAND_NM")
    private String name;

    public BrandDto(String name){
        this.name = name;
    }

}
