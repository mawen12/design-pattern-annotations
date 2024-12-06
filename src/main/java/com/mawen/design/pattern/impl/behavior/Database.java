package com.mawen.design.pattern.impl.behavior;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="1181963012mw@gmail.com">mawen12</a>
 * @since 2024/11/29
 */
public class Database {

	private final Map<String, String> users;

	public Database() {
		users = new HashMap<>();
		users.put("admin_username", "admin_password");
		users.put("user_username", "user_password");
	}

	public boolean isValidUser(String username) {
		return users.containsKey(username);
	}

	public boolean isValidPassword(String username, String password) {
		return password.equals(users.get(username));
	}
}
