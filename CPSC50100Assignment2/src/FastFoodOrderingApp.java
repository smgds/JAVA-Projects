//**********************************************************************************
//FastFoodApp.java	Author: Amy Noyes
//
//Customer can choose pick up or delivery, identifies delivery area and fee, and 
//food options and Tax.
//**********************************************************************************

import java.util.Scanner;

public class FastFoodOrderingApp {

	public static void main(String[] args) {
		int Zipcode = 0;
		double Blimp_Burger = 4.50;
		double Airship_Nachos = 5.50;
		double Zeppelin_Nachos = 7.50;		
		double Terminal_Fries = 2.50;
		double Bomber_Blast_Beverage = 1.50;
		double Control_Tower_Cake = 3.00;
		double Tax = .05;
		double Subtotal = 0;
		double DeliveryAvailable = 5.00;
		double DeliveryWithExtraCost = 7.00;
		double CalculateTax = 0;
		double Total = 0;
		int Blimp_BurgerCount = 0;
		int Airship_NachosCount = 0;
		int Zeppelin_NachosCount = 0;
		int Bomber_Blast_BeverageCount = 0;
		int Terminal_FriesCount = 0;
		int Control_Tower_CakeCount = 0;
		int[] DeliveryZips = {60442, 60443,	60444, 60445, 60446, 60447, 60448, 60449, 60450};
		int[] DeliveryExtra = {60441, 60451};
		String Delivery;
		
		// Takeout Order
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Flyers Cafe: Home of the Blimp Burger");
		System.out.println("Will this be Delivery or Pickup (1 for Delivery and 2 for Takeout)?");
		Delivery = scan.nextLine();
		
		if (Delivery.equals("2"))
		{
			System.out.println("Enter Takeout Order\n");
			
			System.out.println("Number of Blimp Burgers?");
			Blimp_BurgerCount = scan.nextInt();
			
			System.out.println("Number of Airship Nachos (Regular Size)?");
			Airship_NachosCount = scan.nextInt();
			
			System.out.println("Number of Zeppelin Nachos (Jumbo Size)?");
			Zeppelin_NachosCount = scan.nextInt();
				
			System.out.println("Number of Terminal Fries?");
			Terminal_FriesCount = scan.nextInt();
				
			System.out.println("Number of Bomber Blast Beverages?");
			Bomber_Blast_BeverageCount = scan.nextInt();
				
			System.out.println("Number of Control Tower Cakes?");
			Control_Tower_CakeCount = scan.nextInt();
				
			//Takeout Order Total
			Subtotal = (Blimp_BurgerCount * Blimp_Burger + Airship_NachosCount * Airship_Nachos + Zeppelin_NachosCount * Zeppelin_Nachos
					+ Terminal_FriesCount * Terminal_Fries + Bomber_Blast_BeverageCount * Bomber_Blast_Beverage + Control_Tower_CakeCount * Control_Tower_Cake);
			CalculateTax = Subtotal * Tax;
			Total = Subtotal + CalculateTax;
					
			System.out.println("Amount Due:" + Total);
			System.out.println("Thank You For Choosing Flyers!");
						
		}
		
		// Delivery Order - $5 Fee	
		if (Delivery.equals("1"))
		{
			System.out.println("Please Enter Zipcode:");
			Zipcode = scan.nextInt();
		}
			
		for (int i = 0; i < DeliveryZips.length; i++)
		{
			if (Zipcode == DeliveryZips[i])
		{
				System.out.println("Delivery Available - $5");
							
				System.out.println("Number of Blimp Burgers?");
				Blimp_BurgerCount = scan.nextInt();
				
				System.out.println("Number of Airship Nachos (Regular Size)?");
				Airship_NachosCount = scan.nextInt();
				
				System.out.println("Number of Zeppelin Nachos (Jumbo Size)?");
				Zeppelin_NachosCount = scan.nextInt();
					
				System.out.println("Number of Terminal Fries?");
				Terminal_FriesCount = scan.nextInt();
					
				System.out.println("Number of Bomber Blast Beverages?");
				Bomber_Blast_BeverageCount = scan.nextInt();
					
				System.out.println("Number of Control Tower Cakes?");
				Control_Tower_CakeCount = scan.nextInt();
							
				//Delivery Order Totals
				Subtotal = (Blimp_BurgerCount * Blimp_Burger + Airship_NachosCount * Airship_Nachos + Zeppelin_NachosCount * Zeppelin_Nachos
						+ Terminal_FriesCount * Terminal_Fries + Bomber_Blast_BeverageCount * Bomber_Blast_Beverage + Control_Tower_CakeCount * Control_Tower_Cake);
				CalculateTax = Subtotal * Tax;
				Total = Subtotal + CalculateTax + DeliveryAvailable;
				
				System.out.println("Amount Due: $" + Total);
				System.out.println("Thank You For Choosing Flyers!");
				}
			}
		
		// Delivery Order - $7 Fee	
		for (int j = 0; j < DeliveryExtra.length; j++)
		{
			if (Zipcode == DeliveryExtra[j])
			{
				System.out.println("Delivery Available with Extra Cost - $7");
		
				System.out.println("Number of Blimp Burgers?");
				Blimp_BurgerCount = scan.nextInt();
				
				System.out.println("Number of Airship Nachos (Regular Size)?");
				Airship_NachosCount = scan.nextInt();
				
				System.out.println("Number of Zeppelin Nachos (Jumbo Size)?");
				Zeppelin_NachosCount = scan.nextInt();
					
				System.out.println("Number of Terminal Fries?");
				Terminal_FriesCount = scan.nextInt();
					
				System.out.println("Number of Bomber Blast Beverages?");
				Bomber_Blast_BeverageCount = scan.nextInt();
					
				System.out.println("Number of Control Tower Cakes?");
				Control_Tower_CakeCount = scan.nextInt();
						
				//Delivery Order Totals
				Subtotal = (Blimp_BurgerCount * Blimp_Burger + Airship_NachosCount * Airship_Nachos + Zeppelin_NachosCount * Zeppelin_Nachos
						+ Terminal_FriesCount * Terminal_Fries + Bomber_Blast_BeverageCount * Bomber_Blast_Beverage + Control_Tower_CakeCount * Control_Tower_Cake);
				CalculateTax = Subtotal * Tax;
				Total = Subtotal + CalculateTax + DeliveryWithExtraCost;
				
				System.out.println("Amount Due: $" + Total);
				System.out.println("Thank You For Choosing Flyers!");
				}
			}
		
		// Delivery Not Available	
		if (Zipcode != 0 && Zipcode < 60441)
		{
			System.out.println("Delivery Not Available. Coming Soon To Your Neighborhood!");
			}
		
		if (Zipcode != 0 && Zipcode > 60451)
		{
			System.out.println("Delivery Not Available. Coming Soon To Your Neighborhood!");
		} {
			scan.close();		
		}
		}
}

	