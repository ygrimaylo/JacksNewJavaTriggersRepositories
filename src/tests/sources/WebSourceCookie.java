package tests.sources;

import javax.servlet.http.Cookie;

public class WebSourceCookie {
	Cookie cookie = null;

	public String method1() {
		String s01 = cookie.getComment();
		return s01;
	}

	public String method2() {
		String s01 = cookie.getDomain();
		return s01;
	}

	public String method3() {
		String s01 = cookie.getName();
		return s01;
	}

	public String method4() {
		String s01 = cookie.getPath();
		return s01;
	}

	public String method5() {
		String s01 = cookie.getValue();
		return s01;
	}
}
