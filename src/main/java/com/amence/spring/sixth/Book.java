package com.amence.spring.sixth;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Amence on 2016/12/23.
 */
@Component("book")
public class Book{

    @PostConstruct
    public void init(){
        System.out.println("初始化");
    }

    @PreDestroy
    public void destory(){
        System.out.println("销毁");
    }

}
