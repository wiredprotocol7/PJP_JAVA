package lib;

import static org.junit.Assert.*;

import org.junit.Test;

public class RDAccountTest {

	@Test
	public final void testCalculateInterest() {
		RDAccount rdAccount = new RDAccount(6,65,10000);
		assertEquals(800.0, rdAccount.calculateInterest(), 0.0);
	}



}
