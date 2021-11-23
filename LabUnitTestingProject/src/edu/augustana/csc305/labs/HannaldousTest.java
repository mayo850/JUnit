package edu.augustana.csc305.labs;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author izankhan18
 *
 */

public class HannaldousTest {

	@Test
	public void testHannaldousPasswordPass() {
		String test = Hannaldous.check("izanmayo");
		assertEquals("Pass", test);

		String test1 = Hannaldous.check("cSc");
		assertEquals("Pass", test1);

		String test2 = Hannaldous.check("SOFTWAREDEVELOPMENT");
		assertEquals("Pass", test2);

	}

	@Test
	public void testHannaldousPasswordFail() {
		String test = Hannaldous.check("izanmayo!");
		assertEquals("Fail", test);

		String test1 = Hannaldous.check("cSc305");
		assertEquals("Fail", test1);

		String test2 = Hannaldous.check("SOFTWARE DEVELOPMENT");
		assertEquals("Fail", test2);

	}

	@Test
	public void testNumberOfBadPasswords() {
		String[] pass = { "izan", "izan1", "password", "mayo1", "cat2", "cat" };
		int test = Hannaldous.badPassCount(4, pass);
		assertEquals(3, test);

		String[] pass1 = { "dell0", "i1", "password!", "computer@", "cat2!", "cat305" };
		int test1 = Hannaldous.badPassCount(3, pass1);
		assertEquals(1, test1);

		String[] pass2 = { "izan1", "password1", "mayo1", "cat2" };
		int test2 = Hannaldous.badPassCount(1, pass2);
		assertEquals(0, test2);

	}

}
