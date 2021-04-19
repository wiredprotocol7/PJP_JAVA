package lib;

import java.util.*;
import java.util.stream.Stream;

public class FDAccount extends Account{
    int noOfDays;
    int ageofACHolder;
    HashMap<String, ArrayList<Double>> map = new HashMap<String, ArrayList<Double>>();
    public FDAccount(int days, int age, double amount) {
 
    this.map.put("7 14", new ArrayList<>(List.of(4.50, 5.00,6.50)));
    this.map.put("15 29", new ArrayList<>(List.of(4.75, 5.25,6.75)));
    this.map.put("30 45", new ArrayList<>(List.of(5.50, 6.00,6.75)));
    this.map.put("46 60", new ArrayList<>(List.of(7.00,7.50,8.00)));
    this.map.put("61 184", new ArrayList<>(List.of(7.50, 8.00,8.50)));
    this.map.put("185 365", new ArrayList<>(List.of(8.00, 8.50,10.00)));
    
    this.noOfDays=days;
    this.ageofACHolder= age;
    this.amount=amount;
    }

	@Override
	public
	double calculateInterest() {
		// TODO Auto-generated method stub
		int index=(amount>=10000000)?2:(ageofACHolder>60)?1:0;;
		String key = null;
	    for (String bound : map.keySet())
	    	{int[] arr=Stream.of(bound.split(" ")).mapToInt(Integer::parseInt).toArray();
	    	  if((noOfDays>=arr[0]) && (noOfDays<arr[1]))
	    	  {key=bound;break;}
	            };
	    Double interest=amount*map.get(key).get(index)/100;
		
		
		
		return interest;
	}

}
