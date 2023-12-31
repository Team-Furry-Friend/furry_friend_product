package com.v3.furry_friend_product.basket.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class MemberBasketResponseDTO {

    private Long bid;
    private Long pid;       //상품 번호
    private Long mid;
}