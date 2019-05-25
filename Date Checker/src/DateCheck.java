import java.util.Date;
import java.util.Calendar;

public class DateCheck {
	
	public static String Check() {
		
		//Required variables and objects created and initialized 
		String result = "";                              
		Calendar cal = Calendar.getInstance();
		
		for (int yearC = 2002; yearC < 2100; yearC++) {   //A year counter is used in a for loop to check each year, starting from my birth in 2002
			
			//The calendar is set to May 12th of every year. Since May 12th always falls in the second week of May, only the day of the week needs to be checked.
			cal.set(Calendar.YEAR, yearC);
			cal.set(Calendar.MONTH, Calendar.MAY);
			cal.set(Calendar.DATE, 12);

//			System.out.println(cal.getTime());              Used for testing purposes
			
			if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				
				//Outputs the dates. Only the year is changed every time.
				result = result + "Instance of birthday and Mother's Day coinciding on: 5/12/" + yearC + "\n" ;  
			}
				
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Check());

	}

}

/* All occurrences of my birthday on Mother's day, copied from my uncle's email:
Ajay's birthday on Mother's Day in: 12 May, 2002
Ajay's birthday on Mother's Day in: 12 May, 2013
Ajay's birthday on Mother's Day in: 12 May, 2019
Ajay's birthday on Mother's Day in: 12 May, 2024
Ajay's birthday on Mother's Day in: 12 May, 2030
Ajay's birthday on Mother's Day in: 12 May, 2041
Ajay's birthday on Mother's Day in: 12 May, 2047
Ajay's birthday on Mother's Day in: 12 May, 2052
Ajay's birthday on Mother's Day in: 12 May, 2058
Ajay's birthday on Mother's Day in: 12 May, 2069
Ajay's birthday on Mother's Day in: 12 May, 2075
Ajay's birthday on Mother's Day in: 12 May, 2080
Ajay's birthday on Mother's Day in: 12 May, 2086
Ajay's birthday on Mother's Day in: 12 May, 2097
*/

/* Instances outputted by this program:
Instance of birthday and Mother's Day coinciding on: 5/12/2002
Instance of birthday and Mother's Day coinciding on: 5/12/2013
Instance of birthday and Mother's Day coinciding on: 5/12/2019
Instance of birthday and Mother's Day coinciding on: 5/12/2024
Instance of birthday and Mother's Day coinciding on: 5/12/2030
Instance of birthday and Mother's Day coinciding on: 5/12/2041
Instance of birthday and Mother's Day coinciding on: 5/12/2047
Instance of birthday and Mother's Day coinciding on: 5/12/2052
Instance of birthday and Mother's Day coinciding on: 5/12/2058
Instance of birthday and Mother's Day coinciding on: 5/12/2069
Instance of birthday and Mother's Day coinciding on: 5/12/2075
Instance of birthday and Mother's Day coinciding on: 5/12/2080
Instance of birthday and Mother's Day coinciding on: 5/12/2086
Instance of birthday and Mother's Day coinciding on: 5/12/2097

*/

