
import java.time.*;
import java.util.*;
public class DaysDifference {
	
		static void findDifference(LocalDate start_date,LocalDate end_date)
		{

		Period diff= Period.between(start_date,end_date);

			
			System.out.print(
				"Difference between two dates is: ");

			// Print the result
			System.out.printf("%d years, %d months"
					+ " and %d days ",diff.getYears(),diff.getMonths(),diff.getDays());
			System.out.println();
		}

		// Driver Code
		public static void main(String[] args)
		{
			// Start date
			LocalDate start_date
				= LocalDate.of(2020, 01, 10);

			// End date
			LocalDate end_date
				= LocalDate.of(2022, 07, 19);

			// Function Call
		findDifference(start_date,end_date);
			
			LocalDate date = LocalDate.parse("2022-07-19");
//			LocalDate date = LocalDate.of(2022, 07, 19).plusDays(1);
			//add 5 days
			LocalDate date2 = date.plusDays(5);
			System.out.println("Date "+date+" plus 5 days is "+date2);
			LocalDate date3 =  LocalDate.now().plusDays(1);
		       System.out.println("Adding one day to current date: "+date);
		
	}

}
