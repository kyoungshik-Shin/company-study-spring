package com.example.plan_test_four.dto;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBrandDto is a Querydsl query type for BrandDto
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBrandDto extends EntityPathBase<BrandDto> {

    private static final long serialVersionUID = 1979671271L;

    public static final QBrandDto brandDto = new QBrandDto("brandDto");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QBrandDto(String variable) {
        super(BrandDto.class, forVariable(variable));
    }

    public QBrandDto(Path<? extends BrandDto> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBrandDto(PathMetadata metadata) {
        super(BrandDto.class, metadata);
    }

}

