package com.buildenough.logistics.product;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<ProductDto> findAll();

    ProductDto findById(Integer productId);

    int insertProduct(ProductCreateRequest request);
}
