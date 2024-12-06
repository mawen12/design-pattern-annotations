package com.mawen.design.pattern.impl.behavior;

/**
 * @author <a href="1181963012mw@gmail.com">mawen12</a>
 * @since 2024/11/29
 */
public class ValidPasswordHandler extends BaseHandler {

	private Database database;

	public ValidPasswordHandler(Database database) {
		this.database = database;
	}

	@Override
	public boolean handle(String username, String password) {
		if (!database.isValidPassword(username, password)) {
			System.out.println("Wrong Password!");
			return false;
		}
		return handleNext(username, password);
	}
}
