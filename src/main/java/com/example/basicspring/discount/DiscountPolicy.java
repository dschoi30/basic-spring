package com.example.basicspring.discount;

import com.example.basicspring.member.Member;

public interface DiscountPolicy {
    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
