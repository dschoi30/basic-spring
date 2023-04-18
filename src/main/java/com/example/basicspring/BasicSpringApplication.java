package com.example.basicspring;

import com.example.basicspring.member.Grade;
import com.example.basicspring.member.Member;
import com.example.basicspring.member.MemberService;
import com.example.basicspring.member.MemberServiceImpl;
import com.example.basicspring.order.Order;
import com.example.basicspring.order.OrderService;
import com.example.basicspring.order.OrderServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BasicSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicSpringApplication.class, args);
    }

}
