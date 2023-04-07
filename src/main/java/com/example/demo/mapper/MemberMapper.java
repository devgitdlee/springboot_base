package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
	int userexists();
	int login();
}
