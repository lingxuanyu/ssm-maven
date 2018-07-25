package com.lingxuanyu.mapper;

import com.lingxuanyu.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {


    public User getAllUser();


}
