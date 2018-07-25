package com.lingxuanyu.mapper;

import com.lingxuanyu.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    @Select("select * from ssm where id =1")
    public User getAllUser();


}
