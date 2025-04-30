package com.playdata.orderingservice.ordering.dto;

import com.playdata.productservice.product.entity.Product;
import lombok.*;

@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductResDto {

    private Long id;
    private String name;
    private String category;
    private int price;
    private int stockQuantity;
    private String imagePath;

    public Product toEntity() {
        return Product.builder()
                .id(id)
                .name(name)
                .category(category)
                .price(price)
                .stockQuantity(stockQuantity)
                .imagePath(imagePath)
                .build();
    }
}
