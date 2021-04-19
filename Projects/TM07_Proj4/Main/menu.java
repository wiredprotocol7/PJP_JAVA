package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.SortedMap;

import java.util.TreeMap;


class Card implements Comparable<Card> {
    protected String symbol;
    protected int number;


    public Card(String symbol, int number) {
        super();
        this.symbol = symbol;
        this.number = number;
    }
    @Override
    public int compareTo(Card o) {
    	
    	if (!symbol.equals(o.symbol))
    	
    	{return symbol.compareToIgnoreCase(o.symbol);}
    	
    	else
    	{
    		if(number==o.number) {return 0;}
    		else if(number<o.number) {return -1;}
    		return 1;
    	
    	}
       
    }

    boolean equals(Card obj)
    {
    	if(symbol==obj.symbol & number==obj.number) {return true;}
		return false;
    }


}

public class menu {

    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br= new BufferedReader ( new InputStreamReader(System.in));
        SortedMap<String, ArrayList<Card>> set = new TreeMap<String,ArrayList<Card>>();
   
        System.out.print("Enter the no of cards\n");
        int count=Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            System.out.println("Enter a card:");
            String sym=br.readLine();
            int num=Integer.parseInt(br.readLine());
            Card card = new Card(sym,num);
            
            if (!set.containsKey(sym))
            {   ArrayList<Card> temp= new ArrayList<Card>(); 
                temp.add(card);
            	set.put(sym, temp);}
            else
            {
            	set.get(sym).add(card);
            }
        }
    
        System.out.println("Cards in Set are:");

     
        for (String key : set.keySet())
        	for (Card card:set.get(key))
               System.out.println(card.symbol + " " + card.number);

        br.close();
    }

}