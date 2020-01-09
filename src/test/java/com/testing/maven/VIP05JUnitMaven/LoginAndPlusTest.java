package com.testing.maven.VIP05JUnitMaven;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PlusTest.class,LoginParamTest.class })
public class LoginAndPlusTest {

}
