package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

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
    	return symbol.compareToIgnoreCase(o.symbol);
       
    }

    boolean equals(Card obj)
    {
    	if(symbol==obj.symbol) {return true;}
		return false;
    }


}

public class menu {

    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br= new BufferedReader ( new InputStreamReader(System.in));
        SortedSet<Card> set = new TreeSet<Card>();
        System.out.print("Enter the no of cards\n");
        int count=Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            System.out.println("Enter a card:");
            String sym=br.readLine();
            int num=Integer.parseInt(br.readLine());
            Card card = new Card(sym,num);
            set.add(card);
        }
        set=Collections.unmodifiableSortedSet(set);

        System.out.println("Cards in Set are:");


        for (Card card : set)
            System.out.println(card.symbol + " " + card.number);

        br.close();
    }

}