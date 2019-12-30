package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.UserMapper;
import com.example.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer userId) {
		// TODO Auto-generated method stub
		return userMapper.deleteByPrimaryKey(userId);
	}

	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return userMapper.insert(record);
	}

	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return userMapper.insertSelective(record);
	}

	@Override
	public User selectByPrimaryKey(Integer userId) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKey(record);
	}

}
