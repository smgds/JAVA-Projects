import java.util.Scanner;

//CalculatePay.java		Author: Amy Noyes


public class CalculatePay extends PaidAdvisor {

		//User Input
		public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("First Name: ");
			String firstName = scan.next();
			
			System.out.println("Last Name: ");
			String lastName = scan.next();
			
			System.out.println("Total Hours Worked: ");
			double hoursWorked = scan.nextDouble();
			
			System.out.println("Special Hours Worked: ");
			double hoursSpecial = scan.nextDouble();
			
			
			PaidAdvisor Calculate = new PaidAdvisor();
			
			double PayRate = Calculate.getPayRate();
			
			Calculate.setNameRateHours(firstName, lastName, PayRate, hoursWorked, hoursRegular, 
					Overtime, hoursSpecial);
			
			System.out.println(Calculate.calculatePay());
			System.out.println(Calculate.toString());	

			scan.close();
		}

	}