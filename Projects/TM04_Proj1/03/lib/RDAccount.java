package lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class RDAccount extends Account{


	int noOfMonths;
    int ageofACHolder;
    HashMap<String, ArrayList<Double>> map = new HashMap<String, ArrayList<Double>>();
    public RDAccount(int days, int age, double amount) {
 
    this.map.put("6 8", new ArrayList<>(List.of(7.50, 8.00)));
    this.map.put("9 11", new ArrayList<>(List.of(7.750, 8.25)));
    this.map.put("12 14", new ArrayList<>(List.of(8.00, 8.50)));
    this.map.put("15 17", new ArrayList<>(List.of(8.25, 8.75)));
    this.map.put("18 21", new ArrayList<>(List.of(8.50, 9.00)));
    this.map.put("22 "+Integer.toString(Integer.MAX_VALUE), new ArrayList<>(List.of(8.75, 9.25)));
   
    
    this.noOfMonths=days;
    this.amount=amount;
    this.ageofACHolder=age;
    }

	@Override
	public
	double calculateInterest() {
		// TODO Auto-generated method stub
		int index=(ageofACHolder>60)?1:0;
		String key = null;
	    for (String bound : map.keySet())
	    	{int[] arr=Stream.of(bound.split(" ")).mapToInt(Integer::parseInt).toArray();
	    	  if((noOfMonths>=arr[0]) && (noOfMonths<arr[1]))
	    	  {key=bound;break;}
	            };
	    Double interest=amount*map.get(key).get(index)/100;
		
		
		
		return interest;
	}
}
