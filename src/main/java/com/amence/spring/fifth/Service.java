package com.amence.spring.fifth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Amence on 2016/12/23.
 */

@Component

public class Service {


    @Autowired
    @Qualifier("myDao")
    private Dao dao;

    public void save() {
        dao.save();
        System.out.println("service save");
    }
}
