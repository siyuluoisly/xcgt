package com.tjxcgt.ly.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tjxcgt.ly.entity.CommonFormMap;
import com.tjxcgt.ly.entity.user;

@Mapper
public interface UserMapper {
	//获取用户名单
    public List<user> getUser();
    
    public List<CommonFormMap> getFileNames();
}
