package com.cos.blog.service;

import com.cos.blog.domain.user.User;
import com.cos.blog.domain.user.dto.JoinReqDto;
import com.cos.blog.domain.user.dto.LoginReqDto;
import com.cos.blog.domain.user.dto.UpdateReqDto;

public class UserService {
	//회원가입, 회원수정, 로그인, 로그아웃, 아이디중복체크, 
	public int 회원가입(JoinReqDto dto) {
		
		return -1;
	}
	
	//select * from user inner join board on where username=" and password=?
	public User 로그인(LoginReqDto dto) {
		return null;
	}
	
	public int 회원수정(UpdateReqDto dto) {
		return -1;
	}
	
	public int 아이디중복체크(String username) {
		return -1;
	}
}
