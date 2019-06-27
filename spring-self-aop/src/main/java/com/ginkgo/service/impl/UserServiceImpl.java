package com.ginkgo.service.impl;

import com.ginkgo.service.UserService;

//user 服务层
public class UserServiceImpl implements UserService {

	// spring 事务封装呢？ aop技术
	@Override
	public void add() {
		System.out.println("往数据库添加数据...");
	}

}
