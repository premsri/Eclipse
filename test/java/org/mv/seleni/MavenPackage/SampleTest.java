package org.mv.seleni.MavenPackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleTest {
	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test2");

	}
	@Before
	public void beforeMethod() {
		System.out.println("bm");

	}
	@After
	public void afterMethod() {
		System.out.println("am");

	}
	@BeforeClass
	public static void beforeClass() {
		System.out.println("bc");

	}
	@AfterClass
	public static void afterClass() {
		System.out.println("ac");

	}

}