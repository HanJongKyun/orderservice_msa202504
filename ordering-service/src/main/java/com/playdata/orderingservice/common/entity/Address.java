package com.playdata.orderingservice.common.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

// 타 엔터티에서 사용 가능한 형태로 만드는 아노테이션
@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    
    private String city; // 시
    private String street; // 도
    private String zipCode; // 우편번호
}
