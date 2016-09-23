package com.codiscope.jaks.triggers.java.cookie;

import javax.servlet.http.Cookie;

/**
 * The class CookieScope
 */
public class CookieScope {

	/**
	 * Test which should be found by Jacks
	 */
	public void positiveTest(){

		String sessionID= "";
		Cookie cookie = new Cookie("jsessionID", sessionID);
		cookie.setPath("/");
	}

	/**
	 * Test which should be found by Jacks
	 */
	public void negativeTest(){
		
		String sessionID= "";
		Cookie cookie = new Cookie("jsessionID", sessionID);
		cookie.setSecure(true);
		cookie.setPath("/");
	}


}
