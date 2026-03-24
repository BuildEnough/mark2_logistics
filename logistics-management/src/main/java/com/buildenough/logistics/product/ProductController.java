package com.buildenough.logistics.product;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<ProductDto> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/all")
    public List<ProductDto> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{productId}")
    public ProductDto getProductById(@PathVariable Integer productId) {
        return productService.getProductById(productId);
    }

    @PostMapping
    public ProductDto createProduct(@Valid @RequestBody ProductCreateRequest request) {
        return productService.createProduct(request);
    }

    @PutMapping("/{productId}")
    public ProductDto updateProduct(@PathVariable Integer productId,
                                    @Valid @RequestBody ProductUpdateRequest request) {
        return productService.updateProduct(productId, request);
    }

    @PatchMapping("/{productId}/deactivate")
    public ProductDto deactivateProduct(@PathVariable Integer productId) {
        return productService.deactivateProduct(productId);
    }
}
