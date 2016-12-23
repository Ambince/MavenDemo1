package com.amence.spring.eighth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Amence on 2016/12/23.
 */

@Configuration
public class BeanConfig {

    @Bean
    public UserDao userDao(){
        return new UserDao();
    }

    @Bean
    public BookDao bookDao(){
        return  new BookDao();
    }
}
