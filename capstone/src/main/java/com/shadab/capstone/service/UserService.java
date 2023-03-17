package com.shadab.capstone.service;

import com.shadab.capstone.entity.UserDtls;

public interface UserService {

	public UserDtls createUser(UserDtls user);

	public boolean checkEmail(String email);
}
