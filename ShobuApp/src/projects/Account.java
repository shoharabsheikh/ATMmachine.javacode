package projects;
import java.util.*;
import java.text.DecimalFormat;
public class Account {
	
	private int CustomerNumber;
	private int pinNumber;
	private double currentBalance = 0;
	private double savingBalance = 0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	public int setCustomerNumber (int CustomerNumber) {
		this.CustomerNumber = CustomerNumber;
		return CustomerNumber;
	}
	
	public int getCustomerNumber () {
		return CustomerNumber;
	}
	
	public int setPinNumber (int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	public int getPinNumber () {
		return pinNumber;
	}
	
	public double getSavingBalance () {
		return savingBalance;
	}
	
	public double getCurrentBalance () {
		return currentBalance;
	}
	
	public double calcSavingWithdraw(double ammount) {
		savingBalance = (savingBalance - ammount);
		return savingBalance;
	}
	
	
	public double calcCurrentWithdraw(double ammount) {
		currentBalance = (currentBalance - ammount);
		return currentBalance;
	}
	
	public double calcSavingDeposite(double ammount) {
		savingBalance = (savingBalance + ammount);
		return savingBalance;
	}
	
	
	public double calcCurrentDeposite(double ammount) {
		currentBalance = (currentBalance + ammount);
		return currentBalance;
	}
	
	public void getCurrentWithdrawInput(){
		System.out.println("Current Account balance :"+ moneyFormat.format(currentBalance));
		System.out.println("Ammount you want to withdraw from Current account : ");
		double ammount = input.nextDouble();
		
		if((currentBalance - ammount) >=0) {
			calcCurrentWithdraw(ammount);
			System.out.println("New Current Account balance: "+ moneyFormat.format(currentBalance));
		}else {
			System.out.println("Balance cannot be Negetive.");
		}
	}
	public void getSavingWithdrawInput(){
		System.out.println("Saving Account balance :"+ moneyFormat.format(savingBalance));
		System.out.println("Ammount you want to withdraw from Saving account : ");
		double ammount = input.nextDouble();
		
		if((currentBalance - ammount) >=0) {
			calcSavingWithdraw(ammount);
			System.out.println("New Current Account balance: "+ moneyFormat.format(savingBalance));
		}else {
			System.out.println("Balance cannot be Negetive.");
		}
	}
	
	public void getSavingDepositeInput(){
		System.out.println("Saving Account balance :"+ moneyFormat.format(savingBalance));
		System.out.println("Ammount you want to deposite from Saving account : ");
		double ammount = input.nextDouble();
		
		if((currentBalance + ammount) >=0) {
			calcSavingDeposite(ammount);
			System.out.println("New Current Account balance: "+ moneyFormat.format(savingBalance));
		}else {
			System.out.println("Balance cannot be Negetive.");
		}
	}
	
	public void getCurrentDepositeInput(){
		System.out.println("Saving Account balance :"+ moneyFormat.format(currentBalance));
		System.out.println("Ammount you want to deposite from Saving account : ");
		double ammount = input.nextDouble();
		
		if((currentBalance + ammount) >=0) {
			calcCurrentWithdraw(ammount);
			System.out.println("New Current Account balance: "+ moneyFormat.format(currentBalance));
		}else {
			System.out.println("Balance cannot be Negetive.");
		}
	}
}

