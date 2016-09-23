package tests.sources;

import java.util.Enumeration;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WebSource {
	
	HttpServletRequest request = null;
	HttpServletResponse response = null;
	
	public String method1() {
		String s01 = request.getRemoteHost();
		return s01;
	}
	
	public String method2() {
		String[] s01 = request.getParameterValues("abc");
		return s01.toString();
	}
	
	public String method3() {
		Enumeration s01 = request.getParameterNames();
		return s01.toString();
	}
	
	public String method4() {
		Map s01 = request.getParameterMap();
		return s01.toString();
	}
	
	public String method5() {
		String s01 = request.getHeader("header-1");
		return s01;
	}
	
	public String method6() {
		String s01 = request.getQueryString(); 
		return s01;
	}
	
	public String method7() {
		String s01 = request.getRemoteUser(); 
		return s01;
	}
	public String method8() {
		String s01 = request.getRequestedSessionId(); 
		return s01;
	}
	
	public String method9() {
		String s01 = request.getRequestURI(); 
		return s01;
	}
	
	public String method10() {
		StringBuffer s01 = request.getRequestURL(); 
		return s01.toString();
	}
	
	public String method11() {
		String s01 = request.getContentType(); 
		return s01;
	}
	
	public String method12() {
		Cookie[] s01 = request.getCookies(); 
		return s01.toString();
	}
	
	public String method13() {
		Enumeration s01 = request.getHeaders("header-2"); 
		return s01.toString();
	}
	
	public String method14() {
		String s01 = request.getLocalName(); 
		return s01;
	}
	
	public String method15() {
		String s01 = request.getParameter("hidden-field-1");
		return s01;
	}
}
