package com.mawen.design.pattern.impl.behavior;

/**
 * @author <a href="1181963012mw@gmail.com">mawen12</a>
 * @since 2024/11/29
 */
public class RoleCheckHandler extends BaseHandler {

	@Override
	public boolean handle(String username, String password) {
		if ("admin_username".equals(username)) {
			System.out.println("Loading Admin Page...");
			return true;
		}
		System.out.println("Loading Default Page...");
		return handleNext(username, password);
	}
}
