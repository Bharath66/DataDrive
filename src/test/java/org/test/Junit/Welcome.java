package org.test.Junit;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Welcome {
	@Before
	public void beforeMethod() {
		Date d = new Date();
		System.out.println(d);
	}
	@After
	public void afterMethod() {
		Date d = new Date();
		System.out.println(d);
	}
	@Test
	public void test1() {
		
	}

}
