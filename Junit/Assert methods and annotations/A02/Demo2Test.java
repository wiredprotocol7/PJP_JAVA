

import static org.junit.Assert.*;



public class Demo2Test {
	
	Demo2 demo2 = new Demo2();
	
	@Test
	public void testPalindromeCheck() {
		assertTrue(demo2.palindromeCheck("ABABA"));
		assertTrue(demo2.palindromeCheck("LIIIL"));
		assertFalse(demo2.palindromeCheck("LILITH"));
		assertFalse(demo2.palindromeCheck("ANANGEL"));
	}

}
