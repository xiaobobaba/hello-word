package com.example.demo.service.login.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.login.UserDao;
import com.example.demo.entity.login.UserEntity;
import com.example.demo.entity.user.UserRolePrivilege;
import com.example.demo.service.login.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	/**
	 * 
	* <p>Title: 用户登录</p>  
	* <p>Description: </p>  
	* @param user
	* @return  
	* @see com.example.demo.service.login.UserService#findUserLogin(com.example.demo.entity.login.UserEntity)
	 */
	@Override
	public UserEntity findUserLogin(UserEntity user) {
		return userDao.findUserLogin(user);
	}
	/**
	 * 
	* <p>Title: 新增用户</p>  
	* <p>Description: </p>  
	* @param user
	* @return  
	* @see com.example.demo.service.login.UserService#insertUser(com.example.demo.entity.login.UserEntity)
	 */
	@Override
	public int insertUser(UserEntity user) {
		return userDao.insertUser(user);
	}
	/**
	 * 
	* <p>Title: 新增微信用户</p>  
	* <p>Description: </p>  
	* @param user
	* @return  
	* @see com.example.demo.service.login.UserService#insertWXUser(com.example.demo.entity.login.UserEntity)
	 */
	@Override
	public int insertWXUser(UserEntity user) {
		return userDao.insertWXUser(user);
	}
	/**
	 * 
	* @Title: findUserRole  
	* @Description: TODO(查询用户的权限)  
	* @param @param user
	* @param @return    参数  
	* @return Set<UserRolePrivilege>    返回类型  
	* @date 2019年12月3日下午2:42:05  
	* @throws
	 */
	@Override
	public List<UserRolePrivilege> findUserRole(UserEntity user) {
		return userDao.findUserRole(user);
	}

}
