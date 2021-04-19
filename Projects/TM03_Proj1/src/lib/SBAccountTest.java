package lib;

import static org.junit.Assert.*;

import org.junit.Test;

public class SBAccountTest {

	@Test
	public final void testCalculateInterest() {
		SBAccount sbAccount = new SBAccount("NRI",10000.00);
		assertEquals(600.0, sbAccount.calculateInterest(), 0.0);
	}



}
