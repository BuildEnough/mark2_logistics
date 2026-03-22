package com.buildenough.logistics.product;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {

    private Integer productId;
    private String productCode;
    private String productName;
    private String specification;
    private String unit;
    private Integer price;
    private String useYn;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
