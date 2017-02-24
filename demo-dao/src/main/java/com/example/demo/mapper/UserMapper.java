package com.example.demo.mapper;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Administrator on 2017/2/24.
 */

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user(name, age) VALUES(#{name}, #{age})")
    void insert(User user);

}
