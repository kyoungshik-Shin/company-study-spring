package com.example.plan_test_four.dto;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QGoodsDto is a Querydsl query type for GoodsDto
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGoodsDto extends EntityPathBase<GoodsDto> {

    private static final long serialVersionUID = -166702920L;

    public static final QGoodsDto goodsDto = new QGoodsDto("goodsDto");

    public final NumberPath<Integer> amt = createNumber("amt", Integer.class);

    public final StringPath goodsNm = createString("goodsNm");

    public final StringPath id = createString("id");

    public final NumberPath<Integer> qty = createNumber("qty", Integer.class);

    public QGoodsDto(String variable) {
        super(GoodsDto.class, forVariable(variable));
    }

    public QGoodsDto(Path<? extends GoodsDto> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGoodsDto(PathMetadata metadata) {
        super(GoodsDto.class, metadata);
    }

}

