package com.mawen.design.pattern.impl.behavior;

/**
 * @author <a href="1181963012mw@gmail.com">mawen12</a>
 * @since 2024/11/29
 */
public class UserExistsBaseHandler extends BaseHandler {

	private Database database;

	public UserExistsBaseHandler(Database database) {
		this.database = database;
	}

	@Override
	public boolean handle(String username, String password) {
		if (!database.isValidUser(username)) {
			System.out.println("This username is not registered!");
			System.out.println("Sign up to our app now!");
			return false;
		}
		return handleNext(username, password);
	}
}
