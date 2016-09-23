package tests.sources;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseSource {

	public String method1() {
		String name = null;
		try {
			ResultSet rs = null;
			while (rs.next()) {
				name = name + rs.getString("Lname");
			}
		} catch (Exception e) {
			//
		}
		return name;
	}

	public String method2() {
		ResultSet rs = null;
		Object column1 = null;
		try {
			column1 = rs.getObject(0);
		} catch (SQLException e) {
			//
		}
		return column1.toString();
	}
}
