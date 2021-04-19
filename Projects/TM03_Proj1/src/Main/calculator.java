package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Exception.InvalidAge;
import Exception.InvalidAmount;
import Exception.InvalidDay;
import lib.FDAccount;
import lib.RDAccount;
import lib.SBAccount;

public class calculator {

	public static void main(String[] args) throws IOException, NumberFormatException {

		
		BufferedReader br= new BufferedReader ( new InputStreamReader(System.in));
		int choice = 0;
		
		do {
			System.out.print("\n1.Calculator – SBA: ");
			System.out.print("\n2.Calculator – FDA: ");
			System.out.print("\n3.Calculator – RDA: ");
			System.out.print("\n4. Exit");
			System.out.print("\nEnter your option (1..4): ");
			
			choice  = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:
				
				System.out.print("\nEnter the Average amount in your account: ");
				double amount = Double.parseDouble(br.readLine());
				System.out.print("\nEnter your category: ");
				String cat=br.readLine();
				
						
				
				try {
					if(amount<0||amount>Integer.MAX_VALUE) {
						throw new InvalidAmount();
					}
					else {
						SBAccount sbAccount = new SBAccount(cat,amount);
						System.out.println("Interest gained: Rs. " + sbAccount.calculateInterest());
					}
				}
				catch(InvalidAmount e) {}
				break;
				
			case 2:
				
				
				System.out.print("\nEnter the FD ammount: ");
				double amount2 = Double.parseDouble(br.readLine());
				
				System.out.print("\nEnter number of days: ");
				int days =Integer.parseInt(br.readLine());
				
				System.out.print("\nEnter your age: ");
				int age = Integer.parseInt(br.readLine());
				try {
					if(amount2 < 0) {
						throw new InvalidAmount();
					}
					else if(days < 0) {
						throw new InvalidDay();
					}
					else if(age < 0) {
						throw new InvalidAge();
					}
					else {
						FDAccount fdAccount = new FDAccount(days,age,amount2);
						System.out.println("Interest gained: Rs. " + fdAccount.calculateInterest());
					}
					
				}
				catch(InvalidAmount e) {}
				catch(InvalidDay e) {}
				catch(InvalidAge e) {}
				break;
				
			case 3:
				
				
				System.out.print("\nEnter the RD ammount: ");
				double amount3 = Double.parseDouble(br.readLine());
				System.out.print("\nEnter number of months: ");
				int Months = Integer.parseInt(br.readLine());
				
				System.out.print("\nEnter your age: ");
				 age =Integer.parseInt(br.readLine());
				
				try {
					if(amount3 < 0) {
						throw new InvalidAmount();
					}
					else if(Months < 0) {
						throw new InvalidDay();
					}
					else if(age < 0) {
						throw new InvalidAge();
					}
					else {
						RDAccount rdAccount = new RDAccount(Months,age,amount3);
						System.out.println("Interest gained: Rs. " + rdAccount.calculateInterest());
					}
				}
				catch(InvalidAmount e) {}
				catch(InvalidDay e) {}
				catch(InvalidAge e) {}
				break;
				
			case 4:
				System.out.println("EXITED");
				break;
				
			default:
				break;
			}
		} while (choice != 4);
		br.close();

	}

}
