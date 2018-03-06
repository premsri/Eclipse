package org.mv.seleni.MavenPackage;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SampleTestTest {

	@Test
	public void test() {
		String s="welcome";
		Assert.assertEquals("welcome", s);
	}
	@Test
	public void test1() {
		String s="welcome";
		Assert.assertTrue(s.contains("e"));
	}
	@Test
	public void test2() {
		String s="welcome";
		Assert.assertTrue(s.contains("p"));

	}
}
