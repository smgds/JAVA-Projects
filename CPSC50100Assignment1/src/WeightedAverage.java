/*Calculates weighted average of tests, weighted average of assignments, 
  and total weighted average */

public class WeightedAverage {

	public static void main(String[] args) {
		
//Weighted Average (Scores*Weight)		
		double T1 = 75 * 0.10;
		double T2 = 95 * 0.20;
		double T3 = 85 * 0.25;
		double T4 = 55 * 0.25;
		double T5 = 65 * 0.10;
		double T6 = 70 * 0.10;
		
		double A1 = 55 * 0.05;
		double A2 = 65 * 0.10;
		double A3 = 65 * 0.15;
		double A4 = 60 * 0.25;
		double A5 = 55 * 0.25;
		double A6 = 50 * 0.20;

//Weights
		double W1 = 0.10;
		double W2 = 0.20;
		double W3 = 0.25;
		double W4 = 0.25;
		double W5 = 0.10;
		double W6 = 0.10;
		double W7 = 0.05;
		double W8 = 0.10;
		double W9 = 0.15;
		double W10 = 0.25;
		double W11 = 0.25;
		double W12 = 0.20;
		
		double TestWeightedAverage = (T1 + T2 + T3 + T4 + T5 + T6);
		double SumTestWeights = (W1 + W2 + W3 + W4 + W5 + W6);
		double AssignmentWeightedAverage = (A1 + A2 + A3 + A4 + A5 + A6);
		double SumAssignmentWeights = (W7 + W8 + W9 + W10 + W11 + W12);
		
		System.out.println("Test Score Weighted Average:" + TestWeightedAverage/SumTestWeights);
		System.out.println("Assignment Score Weighted Average:" + AssignmentWeightedAverage/SumAssignmentWeights);
		System.out.println("Master Average:" + ((TestWeightedAverage/SumTestWeights + AssignmentWeightedAverage/SumAssignmentWeights)/2));

	}

}
