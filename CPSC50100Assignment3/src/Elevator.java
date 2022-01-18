//Elevator.java		Author: Amy Noyes


import java.util.Scanner;
import java.util.ArrayList; 
import java.util.concurrent.TimeUnit;

public class Elevator {
		
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String selection, Current = "B"; 
		
	ArrayList<String> Level = new ArrayList<String> (); 
	int floor = 0; 
	
	Level.add("B"); 
	Level.add("1");
	Level.add("2");
	
	//Elevator is located in Basement (B)
	System.out.println("The elevator is on" + " " + Level.get(0)); 
	
	//Passenger pushes the button
	System.out.println("Select floor (B,1, or 2)"); 
	selection = scan.nextLine(); 
	if(Current.equals("B") && selection.equals("1")) 
		{
		System.out.println("The elevator is going up");
		floor = floor + 1;
		try {
			TimeUnit.MILLISECONDS.sleep(2000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}						
		System.out.println("The elevator is open");	
		try {
			TimeUnit.MILLISECONDS.sleep(2000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		System.out.println("The elevator is closed");
		Current = "1"; 
		try {
			TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}		
		System.out.println("Choose a floor (B,1, or 2)"); 
		selection = scan.nextLine();
		}
	
	if(Current.equals("B") && selection.equals("2")) 
		{
		System.out.println("The elevator is going up");
		floor = floor + 2;
		try {
			TimeUnit.MILLISECONDS.sleep(2000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}						
		System.out.println("The elevator is open");	
		try {
			TimeUnit.MILLISECONDS.sleep(2000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		System.out.println("The elevator is closed");
		Current = "2"; 
		try {
			TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}		
		System.out.println("Choose a floor (B,1, or 2)"); 
		selection = scan.nextLine();
		}
	
	if(Current.equals("1") && selection.equals("2"))
		{
		System.out.println("The elevator is going up");
		floor = floor + 1;
		try {
			TimeUnit.MILLISECONDS.sleep(2000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}				
		System.out.println("The elevator is open");	
		try {
			TimeUnit.MILLISECONDS.sleep(2000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		System.out.println("The elevator is closed");
		Current = "2";
		try {
			TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		System.out.println("Choose a floor (B,1, or 2)"); 
		selection = scan.nextLine();
		}
	
	if(Current.equals("1") && selection.equals("B"))
		{
		System.out.println("The elevator is going down"); 
		floor = floor - 1;
		try {
			TimeUnit.MILLISECONDS.sleep(2000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}				
		System.out.println("The elevator is open");	
		try {
			TimeUnit.MILLISECONDS.sleep(2000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		System.out.println("The elevator is closed");		
		Current.equals("B"); 
		try {
			TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		System.out.println("Choose a floor (B,1, or 2)"); 
		selection = scan.nextLine();
		}
	
	if(Current.equals("2") && selection.equals("1")) 
		{
		System.out.println("The elevator is going down"); 
		floor = floor - 1;
		try {
			TimeUnit.MILLISECONDS.sleep(2000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}				
		System.out.println("The elevator is open");	
		try {
			TimeUnit.MILLISECONDS.sleep(2000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		System.out.println("The elevator is closed");
		Current.equals("1");
		try {
			TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		System.out.println("Choose a floor (B,1, or 2)"); 
		selection = scan.nextLine();
		}
	
	if(Current.equals("2") && selection.equals("B")) 
		{
			System.out.println("The elevator is going down"); 
			floor = floor - 2;
			try {
				TimeUnit.MILLISECONDS.sleep(2000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}					
			System.out.println("The elevator is open");	
			try {
				TimeUnit.MILLISECONDS.sleep(2000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			System.out.println("The elevator is closed");
			Current.equals("B"); 	
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			System.out.println("Choose a floor (B,1, or 2)"); 
			selection = scan.nextLine();
		}{
			scan.close();
		}
		
}
}