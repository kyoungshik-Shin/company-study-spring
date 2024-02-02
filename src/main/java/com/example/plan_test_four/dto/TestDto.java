package com.example.plan_test_four.dto;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Table(name = "board")
public class TestDto {
    private int boardId;

    private String title;

    private String contents;

    private int hitCnt;

    private String regId;

    private Date regDtime;

    private String uptId;

    private Date uptDtime;

}
