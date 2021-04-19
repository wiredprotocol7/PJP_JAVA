package lib;

import static org.junit.Assert.*;

import org.junit.Test;

public class FDAccountTest {
	
	

	@Test
	public final void testCalculateInterest() {
		FDAccount fdAccount = new FDAccount(91,61,10000.00);
		assertEquals(800.0, fdAccount.calculateInterest(), 0.0);
		FDAccount fdAccount2 = new FDAccount(91,30,10000.00);
		assertEquals(750.0, fdAccount2.calculateInterest(), 0.0);
		
	}



}
