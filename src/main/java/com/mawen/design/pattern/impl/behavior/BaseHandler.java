package com.mawen.design.pattern.impl.behavior;

/**
 * @author <a href="1181963012mw@gmail.com">mawen12</a>
 * @since 2024/11/29
 */
public abstract class BaseHandler implements Handler {

	private BaseHandler next;

	public final BaseHandler setNextHandler(BaseHandler handler) {
		this.next = handler;
		return next;
	}

	protected final boolean handleNext(String username, String password) {
		if (next == null) {
			return true;
		}
		return next.handle(username, password);
	}

}
