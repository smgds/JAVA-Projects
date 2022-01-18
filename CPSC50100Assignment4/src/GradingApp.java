//GradingApp.java		Author: Amy Noyes


import java.util.*;

//Methods

class Calcs {
    public int Sum (List<Integer> a){
        if (a.size() > 0) {
            int Sum = 0;
 
            for (Integer i : a) {
                Sum += i;
            }
            return Sum;
        }
        return 0;
    }
    public double Meanvalue (List<Integer> a){
        int Sum = Sum(a);
        double Mean = 0;
        Mean = Math.abs(Sum / (a.size() * 1.0));
        return Mean;
    }
    public double Stdev (List<Integer> a){
        double Sum = 0;
        double Mean = Meanvalue(a);
 
        for (Integer i : a)
            Sum += Math.pow((i - Mean), 2);
        return Math.sqrt(Sum / ( a.size())); 
    }
}

//Enter Grades
public class GradingApp {

	public static void main(String[] args) {
		//Variables and List declarations 
		int Grade, Nameloop = 0, i = 0, j = 1;
		String Namecheck, Name;
		ArrayList<Integer> Scores = new ArrayList<Integer> ();
		ArrayList<String> Student = new ArrayList<String> ();
		ArrayList<Integer> AverGrade = new ArrayList<Integer>();
		
		
		Scanner user_input = new Scanner(System.in);
		Calcs Calc = new Calcs();
		
				
		while (Nameloop == 0)
		{
		j = 1;
		System.out.println("Please Enter Students Name:");
		Name = user_input.next();
		Student.add(Name);
		
		System.out.println("Exam #1 Score (0 – 50 points):");
		Grade = user_input.nextInt();
			while (Grade > 50 || Grade < 0)
		{
			System.out.println("Grade must be between 0 - 50 points, re-enter Grade:");
			Grade = user_input.nextInt();
		} 			
		Scores.add((int) Grade);
		
		System.out.println("Exam #2 Score (0 – 50 points):");
		Grade = user_input.nextInt();
		while (Grade > 50 || Grade < 0)
		{
		System.out.println("Grade must be between 0 - 50 points, re-enter Grade:");
		Grade = user_input.nextInt();
		} 
		Scores.add((int) Grade);
		
		System.out.println("Exam #3 Score (0 – 50 points):");
		Grade = user_input.nextInt();
		while (Grade > 50 || Grade < 0)
		{
		System.out.println("Grade must be between 0 - 50 points, re-enter Grade:");
		Grade = user_input.nextInt();
		} 
		Scores.add((int) Grade);
		
		System.out.println("Exam #4 Score (0 – 50 points):");
		Grade = user_input.nextInt();
		while (Grade > 50 || Grade < 0)
		{
		System.out.println("Grade must be between 0 - 50 points, re-enter Grade:");
		Grade = user_input.nextInt();
		} 
		Scores.add((int) Grade);
		
		System.out.println("Assignment #1 Score (0 – 75 points):");
		Grade = user_input.nextInt();
		while (Grade > 75 || Grade < 0)
		{
		System.out.println("Grade must be between 0 - 75 points, re-enter Grade:");
		Grade = user_input.nextInt();
		} 
		Scores.add((int) Grade);
		
		System.out.println("Assignment #2 Score (0 – 75 points):");
		Grade = user_input.nextInt();
		while (Grade > 75 || Grade < 0)
		{
		System.out.println("Grade must be between 0 - 75 points, re-enter Grade:");
		Grade = user_input.nextInt();
		} 
		Scores.add((int) Grade);
		
		System.out.println("Assignment #3 Score (0 – 75 points):");
		Grade = user_input.nextInt();
		while (Grade > 75 || Grade < 0)
		{
		System.out.println("Grade must be between 0 - 75 points, re-enter Grade:");
		Grade = user_input.nextInt();
		} 
		Scores.add((int) Grade);
		
		System.out.println("Assignment #4 Score (0 – 75 points):");
		Grade = user_input.nextInt();
		while (Grade > 75 || Grade < 0)
		{
		System.out.println("Grade must be between 0 - 75 points, re-enter Grade:");
		Grade = user_input.nextInt();
		}
		Scores.add((int) Grade);
		
		AverGrade.add((int) Calc.Sum(Scores));
		
		while (j == 1){
		System.out.println("Do you need to enter another students Grades (Y/N)?");
		Namecheck = user_input.next();
			
		if(Namecheck.equalsIgnoreCase("Y") || Namecheck.equalsIgnoreCase("N"))
			{	
				if(Namecheck.equalsIgnoreCase("Y"))
				{
					Scores.clear();
					Nameloop = 0;
					j = 0;
				}
				else 
				{
					Nameloop = 1; 
					j = 0;	
				}
				
		
//Calculates FinalScore		
		double Curve;
        Integer ScoreA, ScoreB, ScoreC, ScoreD, ScoreF;
        
        Curve = (Math.round(Calc.Stdev(AverGrade)));
        
        if(Curve < 3)
    		Curve = 5;
        if(Curve > 10)
    		Curve = 9;
        
        ScoreA = (int) ((Calc.Meanvalue(AverGrade) + (Curve * 2)));
        ScoreB = (int) ((Calc.Meanvalue(AverGrade) + (Curve)));
        ScoreC = (int) (Calc.Meanvalue(AverGrade));
        ScoreD = (int) ((Calc.Meanvalue(AverGrade) - (Curve)));
        ScoreF = (int) ((Calc.Meanvalue(AverGrade) - (Curve * 2)));
        System.out.println(Curve);  
        System.out.println("A = "+ ScoreA );
        System.out.println("B = "+ ScoreB );
        System.out.println("C = "+ ScoreC );
        System.out.println("D = "+ ScoreD );
        System.out.println("E = "+ ScoreF );
		
		//Printing out Scores
        for (i = 0; i < AverGrade.size(); i++ )
        {	System.out.println("Below are the Students Grades for This Class.");
        	
        	if(AverGrade.get(i) >= ScoreA)
        		{
        		System.out.println("Student: "+ Student.get(i)+"   Scored: " + AverGrade.get(i) + "   Final Score: A.\n");
        		}
        	else if ((AverGrade.get(i) >= ScoreB) && (AverGrade.get(i) < ScoreA))
        		{
        		System.out.println("Student: "+ Student.get(i)+"   Scored: " + AverGrade.get(i) + "   Final Score: B.\n");
        		}
        	else if (AverGrade.get(i) >= ScoreC && AverGrade.get(i) < ScoreB)
    		{
    		System.out.println("Student: "+ Student.get(i)+"   Scored: " + AverGrade.get(i) + "   Final Score: C.\n");
    		}
        	else if (AverGrade.get(i) >= ScoreD && AverGrade.get(i) <  ScoreC)
    		{
    		System.out.println("Student: "+ Student.get(i)+"   Scored: " + AverGrade.get(i) + "   Final Score: D.\n");
    		}
        	else if (AverGrade.get(i) < ScoreF)
    		{
    		System.out.println("Student: "+ Student.get(i)+"   Scored: " + AverGrade.get(i) + "   Final Score: F.\n");
    		} {
     			
		}
        }
}
}
}		
}}		