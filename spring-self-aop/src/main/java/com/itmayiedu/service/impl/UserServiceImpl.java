package com.itmayiedu.service.impl;

import com.itmayiedu.service.UserService;

//user 服务层
public class UserServiceImpl implements UserService {

	// spring 事务封装呢？ aop技术
	public void add() {
		System.out.println("往数据库添加数据...");
	}

}
