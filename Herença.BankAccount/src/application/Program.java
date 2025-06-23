package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
	List<Account> list = new ArrayList<>();
	
	list.add(new SavingsAccount("Alex", 1001, 500.0, 0.01));
	list.add(new BusinessAccount("Maria",1002,1000.0, 400.0));
	list.add(new SavingsAccount("Bob", 1003, 300.0, 0.01));
	list.add(new BusinessAccount("Anna",1004,500.0, 500.0));
	
	double sum = 0.0;
	for(Account acc : list) {
		sum += acc.getBalance();
	}
	
	System.out.printf("%.2f%n", sum);
	
	for(Account acc : list) {
		acc.deposit(10.0);
	}
	
	for(Account acc : list ) {
		System.out.printf ("Upadated balance for account %d: %.2f%n",acc.getNumber(), acc.getBalance());
	}
	
	}

}
