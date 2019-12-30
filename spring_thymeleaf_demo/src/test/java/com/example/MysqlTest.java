package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MysqlTest {

	public static void main(String[] args) {
		List<String> war = new ArrayList<String>();
		boolean flag = true;
		/*
		 * File file = new File(
		 * "/spring_thymeleaf_demo/src/main/resources/generator/generatorConfig.xml");
		 * ConfigurationParser cp = new ConfigurationParser();
		 */
		String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		String DB_URL = "jdbc:mysql://localhost:3306/mybatisdemo?serverTimezone=UTC";
		String USER = "orypeu";
		String PASS = "orypeu";
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("连接数据库中！");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(conn != null) {
			System.out.println("数据库连接成功！");
		}
		String sql = "SELECT * FROM mybatisdemo.t_user;";
		PreparedStatement psmt;
		try {
			psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				String name = rs.getString(2);
				war.add(name);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(String name : war) {
			System.out.println(name);
		}
	}
}
