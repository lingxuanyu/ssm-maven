package com.lingxuanyu.controller;


import com.lingxuanyu.entity.User;
import com.sun.xml.internal.fastinfoset.tools.FI_StAX_SAX_Or_XML_SAX_SAXEvent;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.List;

public class TestUser {

    /**
     *  用于测试配置文件正确性
     */
    @Test
    public void testData(){
        ApplicationContext apx  = new ClassPathXmlApplicationContext("applicationContext.xml");
       UserController userController = (UserController)apx.getBean("userController");
        userController.getAllUser();
    }
}
