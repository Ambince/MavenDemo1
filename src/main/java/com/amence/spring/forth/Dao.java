package com.amence.spring.forth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by Amence on 2016/12/23.
 */
public class Dao implements ApplicationContextAware {

    private String beanId;
    private ApplicationContext applicationContext;

    public  DataBase getDB(){
        return (DataBase) applicationContext.getBean(beanId);
    }

    public String getBeanId(){
        return beanId;
    }

    public void setBeanId(String beanId){
        this.beanId = beanId;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
}
