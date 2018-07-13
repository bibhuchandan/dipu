package com.durgasoft.webdriver.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
@Test
public void tc_1() {
	System.out.println("this is first testcase");
	Assert.assertEquals("Test","Test1");
}
@Test
public void tc_2() {
	System.out.println("this is second testcase");
}
@Test
public void tc_3() {
	System.out.println("this is third testcase");
}


}
