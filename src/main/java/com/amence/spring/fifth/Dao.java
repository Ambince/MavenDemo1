package com.amence.spring.fifth;

import org.springframework.stereotype.Component;

/**
 * Created by Amence on 2016/12/23.
 */

@Component("myDao")
public class Dao {
    public void save() {
        System.out.println("dao save");
    }
}
