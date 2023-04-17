package com.example.basicspring;

import com.example.basicspring.member.Grade;
import com.example.basicspring.member.Member;
import com.example.basicspring.member.MemberService;
import com.example.basicspring.member.MemberServiceImpl;
import com.example.basicspring.order.Order;
import com.example.basicspring.order.OrderService;
import com.example.basicspring.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BasicSpringApplication {

    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();

//        MemberService memberService = appConfig.memberService();
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());

//        OrderService orderService = appConfig.orderService();
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order= " + order);

    }

}
