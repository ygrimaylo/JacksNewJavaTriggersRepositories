package com.codiscope.jaks.triggers.java.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 Rule:
 <Rule id="CIGITAL-SQL-001" lang="java">
 <Category>Dynamic Database Query</Category>
 <Title>Use of java.sql.Statement</Title>
 <Description>
 Identifies dangerous method calls of the java.sql.Statement
 class.
 </Description>
 <Match>
 <QualifiedName>java.sql.Statement</QualifiedName>
 <Method><![CDATA[(executeQuery|executeUpdate|execute|addBatch)\b]]></Method>
 </Match>
 <Standards>
 <Standard file="about-sql-injection.xml">
 <Context>J2EE</Context>
 </Standard>
 </Standards>
 </Rule>
 */
public class SQLInjection {
	private String connString = "jdbc:msql://10.10.10.1:1114/Demo";

	public String getAccountNum(int transactionID) {
		return "";
	}

	public void test(int accountID) {
		try {
			Connection conn = DriverManager.getConnection(connString, "", "");
			Statement stmt = conn.createStatement();

			stmt.executeQuery("SELECT * FROM Transactions WHERE AccountNum ="
					+ getAccountNum(accountID));
		} catch (Exception e) {
			//
		}
	}
	
	public void test2(int accountID) {
		try {
			Connection conn = DriverManager.getConnection(connString, "", "");
			Statement stmt = conn.createStatement();

			stmt.executeUpdate("update transactions set amount = 1000 WHERE AccountNum ="
					+ getAccountNum(accountID));
		} catch (Exception e) {
			//
		}
	}
	
	public void test3(int accountID) {
		try {
			Connection conn = DriverManager.getConnection(connString, "", "");
			Statement stmt = conn.createStatement();

			stmt.execute("delete from transactions where AccountNum ="
					+ getAccountNum(accountID));
		} catch (Exception e) {
			//
		}
	}
	
	public void test4(int accountID) {
		try {
			Connection conn = DriverManager.getConnection(connString, "", "");
			Statement stmt = conn.createStatement();

			stmt.addBatch("insert into transactions(AccountNum) values("
					+ getAccountNum(accountID) + ")");
		} catch (Exception e) {
			//
		}
	}
}
