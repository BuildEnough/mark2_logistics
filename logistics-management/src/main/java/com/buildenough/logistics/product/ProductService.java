package com.buildenough.logistics.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductMapper productMapper;

//    public List<ProductDto> getProducts() {
//        return productMapper.findAll();
//    }

    public List<ProductDto> getProducts() {
        return productMapper.findActiveProducts();
    }

    public List<ProductDto> getAllProducts() {
        return productMapper.findAllProducts();
    }

    public ProductDto getProductById(Integer productId) {
        return productMapper.findById(productId);
    }

    public ProductDto createProduct(ProductCreateRequest request) {
        if (request.getUseYn() == null || request.getUseYn().isBlank()) {
            request.setUseYn("Y");
        }

        productMapper.insertProduct(request);
        return productMapper.findById(request.getProductId());
    }

    public ProductDto updateProduct(Integer productId, ProductUpdateRequest request) {
        productMapper.updateProduct(productId, request);
        return productMapper.findById(productId);
    }

    public ProductDto deactivateProduct(Integer productId) {
        productMapper.deactivateProduct(productId);
        return productMapper.findById(productId);
    }
}
