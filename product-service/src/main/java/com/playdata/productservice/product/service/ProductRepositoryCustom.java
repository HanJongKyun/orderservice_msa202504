package com.playdata.productservice.product.service;

import com.playdata.productservice.product.dto.ProductSearchDto;
import com.playdata.productservice.product.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductRepositoryCustom {
    Page<Product> findBySearchCondition(ProductSearchDto dto, Pageable pageable);
}