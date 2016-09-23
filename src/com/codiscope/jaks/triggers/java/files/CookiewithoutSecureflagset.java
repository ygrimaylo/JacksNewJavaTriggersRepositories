package com.codiscope.jaks.triggers.java.files;

import javax.servlet.http.Cookie;

public class CookiewithoutSecureflagset {
	
	public void sendResponseWithFlag(){
		String sessionID= "";
		Cookie cookie = new Cookie("jsessionID", sessionID);
		cookie.setSecure(true);
	}
	
	public void sendResponseWithoutFlag(){
		String sessionID= "";
		Cookie cookie = new Cookie("jsessionID", sessionID);
		cookie.setSecure(false);
	}
		
}
