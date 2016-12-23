package com.amence.spring.fifth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Amence on 2016/12/23.
 */
@Component("myweb")
public class Web {

    @Autowired
    private Service service;

    public void save(){
        service.save();
        System.out.println("web save");
    }
}
