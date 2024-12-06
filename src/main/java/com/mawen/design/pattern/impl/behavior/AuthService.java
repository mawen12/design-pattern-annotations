package com.mawen.design.pattern.impl.behavior;

/**
 * @author <a href="1181963012mw@gmail.com">mawen12</a>
 * @since 2024/11/29
 */
public class AuthService {

	private Handler handler;

	public AuthService(Handler handler) {
		this.handler = handler;
	}

	public boolean logIn(String email, String password) {
		if (handler.handle(email, password)) {
			System.out.println("Authorization was successful!");
			// Do stuff for authorized users
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Database database = new Database();
		BaseHandler handler = new UserExistsBaseHandler(database);
		handler.setNextHandler(new ValidPasswordHandler(database))
				.setNextHandler(new RoleCheckHandler());

		AuthService authService = new AuthService(handler);
		authService.logIn("username", "password");
	}
}
