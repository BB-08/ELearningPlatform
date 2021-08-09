package com.project.dao;

public class DaoTest {
	public static void main(String args[]) {
		LoginDao dao = new LoginDao();
		System.out.println(dao.Check("uname", "pass"));
	}
}
