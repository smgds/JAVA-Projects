public class PaidAdvisor extends Person {
		String Name;
		static double regularPayRate = 25;
		static double specialPayRate = 50;
		static double overtimePayRate = 37.5;
		static double hours;
		static double hoursWorked;
		static double hoursRegular;
		static double hoursSpecial;
		static double TotalPay;
		static double regularPay;
		static double overtimePay;
		static double special;
		static double Overtime;

		//Total hours worked
		public double getHoursWorked() {
			return hoursWorked;
		} 
			
		//Calculates the multiplication of the pay rate and the hours worked
		public double calculatePay() {
				hoursRegular = (hoursWorked - hoursSpecial);
				if (hoursRegular > 30) {
					Overtime = (hoursRegular - 30);
				}
				TotalPay = ((hoursRegular-Overtime) * regularPayRate)+ (Overtime * overtimePayRate)
						+ (hoursSpecial * specialPayRate) ;
				return TotalPay;
		}
		
		//Returns the regular or overtime pay rates
		public double getPayRate() {
				if (hours <= 30) {
					return regularPayRate;
				} else {
					return overtimePayRate;
				}
	} 
		
		//Returns the wages based on the method,
		public void setNameRateHours (String first, String last, double PayRate, double hours, double regular, 
				double overtime, double special) 
				{
			super.setName(first, last);
			Person worker = new Person();
			worker.setName(first, last);
			Name = worker.toString();
			hoursWorked = hours;
			hoursSpecial = special;
			hoursRegular = regular;
			Overtime = overtime;
			}
		
		@Override
		public String toString() {
			return "Name: " + Name + "\n"
			+ "Total Hours Worked: " + hoursWorked + "\n"
			+ "Regular Hours Worked: " + (hoursRegular - Overtime) + "\n"
			+ "Overtime Hours Worked: " + Overtime + "\n"
			+ "Special Hours Worked: " + hoursSpecial + "\n"
			+ "Regular Pay: " + "$" + (regularPayRate * (hoursWorked - Overtime - hoursSpecial)) + "\n"
			+ "Overtime Pay: " + "$" + (Overtime * overtimePayRate) + "\n"
			+ "Special Pay: " + "$" + (specialPayRate * hoursSpecial) + "\n"
			+ "Total Pay: " + "$" + calculatePay() + "\n";
		}
}
