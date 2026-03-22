package com.buildenough.logistics.product;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductCreateRequest {

    private Integer productId;

    @NotBlank(message = "상품코드는 필수입니다.")
    private String productCode;

    @NotBlank(message = "상품명은 필수입니다.")
    private String productName;

    @NotBlank(message = "규격은 필수입니다.")
    private String specification;

    @NotBlank(message = "단위는 필수입니다.")
    private String unit;

    @NotNull(message = "단가는 필수입니다.")
    @Min(value = 0, message = "단가는 0 이상이어야 합니다.")
    private Integer price;

    private String useYn;

}
