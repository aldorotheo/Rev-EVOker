package com.evoker.dao;

import com.evoker.domain.Login;

public interface UserDao {

	public Login getLoginByUserPass(String username, String pass);
}
