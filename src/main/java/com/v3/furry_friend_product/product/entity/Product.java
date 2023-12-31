package com.v3.furry_friend_product.product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.v3.furry_friend_product.common.entity.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;       //상품 번호
    private String pcategory;//카테고리

    private String pname;   //상품명

    private String pexplain;//상품설명

    private Long pprice;    //원가

    private boolean del;    //판매여부

    private Long memberId;

    public void setDel(boolean del) {
        this.del = del;
    }
}
