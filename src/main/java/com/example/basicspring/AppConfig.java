package com.example.basicspring;

import com.example.basicspring.discount.DiscountPolicy;
import com.example.basicspring.discount.FixDiscountPolicy;
import com.example.basicspring.member.MemberRepository;
import com.example.basicspring.member.MemberService;
import com.example.basicspring.member.MemberServiceImpl;
import com.example.basicspring.member.MemoryMemberRepository;
import com.example.basicspring.order.OrderService;
import com.example.basicspring.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // @Configuration 적용 시 싱글톤을 보장, @Bean만 적용 후 호출 시 각 빈은 신규 객체로 생성됨
public class AppConfig {

    @Bean
    public MemberService memberService() {
        // 1번
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        // 1번
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy()
        );
    }
    @Bean
    public MemberRepository memberRepository() {
        // 2번 3번...
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
