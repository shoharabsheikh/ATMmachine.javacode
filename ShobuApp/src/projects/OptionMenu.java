package projects;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.text.DecimalFormat;
public class OptionMenu extends Account {

	
		Scanner menuInput = new Scanner(System.in);
		DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
		
		HashMap <Integer, Integer> data = new HashMap<Integer, Integer>();
		
		public void getLogin() throws IOException{

			int x = 1;
			do {
				try {
					data.put(1234,7777);
					data.put(5678, 8888);
					
					System.out.println("=====WELCOME TO ATM MACHINE=====");
					System.out.println("Enter Your card last 4 digit number :");
					setCustomerNumber(menuInput.nextInt());
					
					System.err.println("Enter Pin number :");
					setPinNumber(menuInput.nextInt());
				}catch(Exception E){
					System.out.println("Invalid Characters. Only number");
					x=2;
				}
				int cn = getCustomerNumber();
				int pn = getPinNumber();
				
				if(data.containsKey(cn) && data.containsValue(pn)) {
					getAccountType();
				}else {
					System.out.println("\nWrong card number or pin\n");
				}
			}while(x==1);
		}

		public void getAccountType() {
			System.out.println("Choose Account type");
			System.out.println("type 1 - Saving account");
			System.out.println("type 2 - Current account");
			System.out.println("type 3 - Exit");
			
			int selection = menuInput.nextInt();
			switch (selection) {

			case(1): 
				getSaving();
				break;
			
			case(2):
				getCurrent();
				break;
				
			case(3):
				System.out.println("\nThank you for usinng ATM\n");
			 	break;
			 	
			 default:
				 System.out.println("Invalid Credencial");
			}
			
		}
		
		public void getSaving() {
			System.out.println("=====Saving Account=====");
			System.out.println("Type 1 - view balance");
			System.out.println("Type 2 - Withdraw");
			System.out.println("Type 3 - Deposite");
			System.out.println("Type 4 - Exit");
			
			int selection = menuInput.nextInt();
			
			switch(selection) {
			case 1:
				System.out.println("Checking Account Balance:"+ moneyFormat.format(getSavingBalance()));
				break;
			
			case 2 :
				getSavingWithdrawInput();
				getAccountType();
				break;
				
			case 3 :
				getSavingDepositeInput();
				getAccountType();
				break;
			
			case 4:
				System.out.println("\nThank You for Banking...!\n");
				break;
				
			default:
				System.out.println("\nInvalid Choice");
				getSaving();
			}
		}

		public void getCurrent() {
			System.out.println("=====Current Account=====");
			System.out.println("Type 1 - view balance");
			System.out.println("Type 2 - Withdraw");
			System.out.println("Type 3 - Deposite");
			System.out.println("Type 4 - Exit");
			
			int selection = menuInput.nextInt();
			
			switch(selection) {
			case 1:
				System.out.println("Checking Account Balance:"+ moneyFormat.format(getCurrentBalance()));
				break;
			
			case 2 :
				getCurrentWithdrawInput();
				getAccountType();
				break;
				
			case 3 :
				getCurrentDepositeInput();
				getAccountType();
				break;
			
			case 4:
				System.out.println("\nThank You for Banking...!\n");
				break;
				
			default:
				System.out.println("\nInvalid Choice\n");
				getCurrent();
			}
		}
}


