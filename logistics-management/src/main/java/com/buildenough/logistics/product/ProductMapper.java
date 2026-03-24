package com.buildenough.logistics.product;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<ProductDto> findAll();

    ProductDto findById(Integer productId);

    int insertProduct(ProductCreateRequest request);

    int updateProduct(@Param("productId") Integer productId,
                      @Param("request") ProductUpdateRequest request);

    int deactivateProduct(Integer productId);
}
