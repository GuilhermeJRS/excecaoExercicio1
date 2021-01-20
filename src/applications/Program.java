package applications;

import java.util.Locale;
import java.util.Scanner;

import domain.exceptions.DomainException;
import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			sc.nextLine();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			while (true) {
				char resp;
				do {
					System.out.print("What do you want to do, deposit (d) or withdraw(w) or fine(f)? ");
					resp = sc.nextLine().charAt(0);
				}
				while (resp != 'd' && resp != 'w' && resp != 'f');
				
				if (resp == 'd') {
					System.out.print("Enter amount for deposit: "); 
					double amount = sc.nextDouble();
					account.deposit(amount);
				} else if (resp == 'w') {
					System.out.print("Enter amount for withdraw: ");
					double amount = sc.nextDouble();
					account.withdraw(amount);
				}else {
					break;
				}
				sc.nextLine();
			}
						
			sc.close();
		}
		catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error!");
		}
	}

}
