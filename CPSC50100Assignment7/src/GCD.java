import java.util.Scanner;

//GCD.java		Author: Amy Noyes

public class GCD 
{
  
  
    public static void main(String args[]) throws OutOfRangeException 
    {
    	
    	
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
               
        System.out.println("Enter First Positive Integer");
        int one = scan.nextInt();
        System.out.println("Enter Second Positive Integer");
        int two = scan.nextInt();
      
        if (one <= 0) 
        	throw new IllegalArgumentException("Entered Integers Must Be Positive");
        
        if (two <= 0) 
        	throw new IllegalArgumentException("Entered Integers Must Be Positive");
        
        if (calcGCD(two, one%two) > 1)
        	System.out.println("GCD of two numbers " + one +" and " 
                    + two +" is :" + calcGCD(one,two));
       
        else
        	throw new OutOfRangeException("GCD is 1");

    }
    
    private static int calcGCD(int one, int two) {
        if(two == 0){
            return one;
        }
        return calcGCD(two, one%two);	
        
    }
}