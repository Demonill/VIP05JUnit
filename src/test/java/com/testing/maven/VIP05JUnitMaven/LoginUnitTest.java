package com.testing.maven.VIP05JUnitMaven;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginUnitTest {

	@Test
	public void test() {
		System.out.println("--------------loginUnitTest被执行了-----------------");
		LoginSample ls=new LoginSample();
		ls.login("111", "2222");
	}

}
