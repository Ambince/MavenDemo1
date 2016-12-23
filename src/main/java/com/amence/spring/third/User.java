package com.amence.spring.third;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by Amence on 2016/12/22.
 */
public class User implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String userName;
    private String password;


    public User() {
        System.out.println("1.构造方法执行");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("2 装载属性，调用setter方法");
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBeanName(String name) {
        System.out.println("3.通过BeanNameAware接口，获得配置文件id属性的内容：" + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        System.out.println("4.通过ApplicationContextAware接口，获得Spring容器，" + applicationContext);
    }

    /**
     * 5 在后处理bean MyBeanPostProcessor.java 处
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("6.通过InitializingBean，确定属性设置完成之后执行");
    }

    public void userInit() {
        System.out.println("7.配置init-method执行自定义初始化方法");
    }

    /**
     * 8  在后处理bean MyBeanPostProcessor.java 处
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("9.通过DisposableBean接口，不需要配置的销毁方法");
    }

    public void userDestroy() {
        System.out.println("10.配置destroy-method执行自定义销毁方法");
    }

}
