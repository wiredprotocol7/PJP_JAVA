import java.util.Iterator;
import java.util.TreeSet;

import java.util.HashSet;
import java.util.Iterator;

class Country {
	TreeSet<String> Hset= new TreeSet<>();
	
	public TreeSet<String> saveCountryNames(String CountryName) 
  {
		Hset.add(CountryName);
		return Hset;
	}
	
	public String getCountry(String Country) {
		Iterator<String> itr = Hset.iterator();
		
		while (itr.hasNext()) {
			if (itr.next().equals(Country))
				return Country;
		}
		return null;
	}
}

public class A04 {

	public static void main(String[] args) {
    
		Country country = new Country();
		country.saveCountryNames("China");
		country.saveCountryNames("Vietnam");
		country.saveCountryNames("Nepal");
		country.saveCountryNames("Japan");
		country.saveCountryNames("India");

		System.out.println(country.getCountry("India"));
		System.out.println(country.getCountry("Japan"));		
	}

}
