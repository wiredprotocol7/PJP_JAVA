package lib;

import java.util.HashMap;

public class SBAccount extends Account{
	String category=null;

    HashMap<String,Integer> map = new HashMap<String, Integer>();
    public SBAccount(String cat, double amount) {
 
    this.map.put("Normal", 4);
    this.map.put("NRI", 6);

    this.amount=amount;
    this.category=cat;
    }

	@Override
	public
	double calculateInterest() {
		// TODO Auto-generated method stub
		String key = category;

	    Double interest=amount*map.get(key)/100;
		
		
		
		return interest;
	}


}
