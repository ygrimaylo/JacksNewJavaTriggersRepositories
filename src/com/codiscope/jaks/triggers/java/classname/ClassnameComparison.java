package com.codiscope.jaks.triggers.java.classname;

import javax.servlet.http.Cookie;

import tests.sources.DatabaseSource;

public class ClassnameComparison {

	public static DatabaseSource dbSrc = new DatabaseSource();

	public static void negativeTest() throws ClassNotFoundException {
		if (dbSrc.getClass() == dbSrc.getClass().getClassLoader().loadClass("tests.sources.DatabaseSource"))
			System.out.println("Classname is same !!");
		
	}

	public static void positiveTest() {
		
		String className = dbSrc.getClass().getName();
		System.out.println(className);

		/* positive test case: */
		if (dbSrc.getClass().getName().equals(className)) {
			System.out.println("Classname is same !!");
		}
		
	}

	public static void main(String[] args) throws ClassNotFoundException {
		
		ClassnameComparison.negativeTest();
		ClassnameComparison.positiveTest();
	}
}

