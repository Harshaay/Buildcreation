package com.gitpractice.patron.crm;

import org.testng.annotations.Test;

public class Login {
	@Test
	public void login()
	{
		System.out.println("login");
	}
	@Test
	public void loginpage(String un,String pwd)
	{
		System.out.println("login with un and pwd");
	}

}
