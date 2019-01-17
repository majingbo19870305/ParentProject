package com.iotek.demo;

import com.iotek.pojo.User;
import com.iotek.user.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        User user = new User();
        user.setUsername("cscs");
        user.setPassword("1111");
        user.setAge(11);
        user.setSex("nan");
        UserService userService = applicationContext.getBean("userServiceImpl", UserService.class);
        int num = userService.register(user);
        System.out.println("num:::"+num);

    }
}
