//**********************************************************************************
//FastFoodApp.java	Author: Amy Noyes
//
//Customer can choose pick up or delivery, identifies delivery area and fee, and 
//food options and tax.
//**********************************************************************************

import java.util.Scanner;

public class FastFoodApp {

	public static void main(String[] args) {
		int zipcode = 0;
		double burger = 4.50;
		double drink = 1.50;
		double fries = 2.50;
		double dessert = 3.00;
		double tax = .05;
		double subtotal = 0;
		double deliveryFee = 5.00;
		double extraDeliveryFee = 7.00;
		double calcTax = 0;
		double total = 0;
		int burgerCount = 0;
		int drinkCount = 0;
		int friesCount = 0;
		int dessertCount = 0;
		int[] deliveryZone = {60442, 60443,	60444, 60445, 60446, 60447, 60448, 60449, 60450};
		int[] extraCostZip = {60451, 60441};
		String delivery;
		
		//initalizing a scanner for keyboard input
		Scanner scanner = new Scanner(System.in);
		System.out.println("**** WELCOME TO FLYERS CAFE! ****");
		System.out.println("Would you like delivery? (yes/no)");
		delivery = scanner.nextLine();
		
		if (delivery.equals("no"))
		{
			System.out.println("Proceed with order\n");
			
			System.out.println("How many burgers would you like ");
			burgerCount = scanner.nextInt();
				
			System.out.println("How many fries would you like?");
			friesCount = scanner.nextInt();
				
			System.out.println("How many drinks would you like?");
			drinkCount = scanner.nextInt();
				
			System.out.println("How many desserts would you like?");
			dessertCount = scanner.nextInt();
				
			//calculate order totals
			subtotal = (burgerCount * burger + drinkCount * drink + friesCount * fries + dessertCount * dessert);
			calcTax = subtotal * tax;
			total = subtotal + calcTax;
					
			//round the resulting value of total
			total = Math.round(total * 100.0) / 100.0;
				
					
			//print total to console
			System.out.println("Subtotal: " + total);
			System.out.println("**** THANK YOU FOR YOUR ORDER! ****");
			
		}
		
				
		if (delivery.equals("yes"))
		{
			System.out.println("Please enter zipcode: ");
			zipcode = scanner.nextInt();
		}
			
		for (int i = 0; i < deliveryZone.length; i++)
		{
			if (zipcode == deliveryZone[i])
		{
				System.out.println("Delivery available");
							
				System.out.println("How many burgers would you like ");
				burgerCount = scanner.nextInt();
						
				System.out.println("How many fries would you like?");
				friesCount = scanner.nextInt();
						
				System.out.println("How many drinks would you like?");
				drinkCount = scanner.nextInt();
						
				System.out.println("How many desserts would you like?");
				dessertCount = scanner.nextInt();
							
				//calculate order totals
				subtotal = (burgerCount * burger + drinkCount * drink + friesCount * fries + dessertCount * dessert);
				calcTax = subtotal * tax;
				total = subtotal + calcTax + deliveryFee;
							
				//round the resulting value of total
				total = Math.round(total * 100.0) / 100.0;
							
				//print total to console
				System.out.println("Subtotal: " + total);
				System.out.println("**** THANK YOU FOR YOUR ORDER! ****");
				}
			}
		
		for (int j = 0; j < extraCostZip.length; j++)
		{
			if (zipcode == extraCostZip[j])
			{
				System.out.println("Delivery available w/ fee");
		
				System.out.println("How many burgers would you like ");
				burgerCount = scanner.nextInt();
				
				System.out.println("How many fries would you like?");
				friesCount = scanner.nextInt();
					
				System.out.println("How many drinks would you like?");
				drinkCount = scanner.nextInt();
					
				System.out.println("How many desserts would you like?");
				dessertCount = scanner.nextInt();
						
				//calculate totals
				subtotal = (burgerCount * burger + drinkCount * drink + friesCount * fries + dessertCount * dessert);
				calcTax = subtotal * tax;
				total = subtotal + calcTax + extraDeliveryFee;
						
				//round the resulting value of total
				total = Math.round(total * 100.0) / 100.0;
						
				//print total to console
				System.out.println("Total: " + total);
				System.out.println("**** THANK YOU FOR YOUR ORDER! ****");
				}
			}
		if (zipcode != 0 && zipcode < 60441)
		{
			System.out.println("Delivery unavailable");
			System.out.println("*** PLEASE CHECK BACK AS WE EXPAND! ***");
			}
		
		if (zipcode != 0 && zipcode > 60451)
		{
			System.out.println("Delivery unavailable");
			System.out.println("*** PLEASE CHECK BACK AS WE EXPAND! ***");
			}
		}
	}