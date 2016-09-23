package tests.sources;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrivateSource {
	
	HttpServletRequest request = null;
	HttpServletResponse response = null;

	public HttpServletRequest getRequest() {
		return request;
	}

	public String method1() {
		String s01 = request.getParameter("password");
		return s01;
	}
}
