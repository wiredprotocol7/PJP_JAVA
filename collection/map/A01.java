import java.io.*;
import java.util.*;
import java.util.Map.Entry;
class CountryMap {
	private HashMap<String, String> M1;
	
	public CountryMap()
  {
		M1 = new HashMap<String, String>();
	}
	
	public HashMap<String, String> saveCountryCapital(String Country, String capital)
  {
		M1.put(Country, capital);
		return M1;
	}
	
	public String getCapital(String CountryName) {
		return M1.get(CountryName);
	}
	
	public String getCountry(String capitalName) {

		
		for(Map.Entry<String,String> entry : M1.entrySet())
		{
			if(entry.getValue().equals(capitalName))
			{
				return entry.getKey();
			}
		}
		
		return null;
	}
	
	public HashMap<String, String> swapKyeValue() {
		HashMap<String, String> M2 = new HashMap<String, String>();	
		for(Map.Entry<String,String> entry : M1.entrySet())
		{
			M2.put(entry.getValue(), entry.getKey());
	
		}				
		return M2;
	}
	
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();
		
	
		for(Map.Entry<String,String> entry : M1.entrySet())
		{
			list.add(entry.getKey());
		}
		

		return list;
	}
}

public class A01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryMap country = new CountryMap();

		country.saveCountryCapital("China", "Beijing");
		country.saveCountryCapital("Japan", "Tokyo");
		country.saveCountryCapital("Korea", "Seoul");
		
		System.out.println(country.getCapital("Korea"));
		System.out.println(country.getCountry("Tokyo"));
		System.out.println(country.toArrayList());
		
		HashMap<String, String> M2 = country.swapKyeValue();
		System.out.println(M2);
	}

}
