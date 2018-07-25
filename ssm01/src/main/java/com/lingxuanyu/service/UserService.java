package com.lingxuanyu.service;

import com.lingxuanyu.entity.User;
import com.lingxuanyu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import javax.xml.ws.ServiceMode;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUser(){
        User user = userMapper.getAllUser();
        return  user;
    }

}
