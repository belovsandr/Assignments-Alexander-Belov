class Months {
	static String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	static int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	static String spring = "spring";
	static String summer = "summer";
	static String autumn = "autumn";
	static String winter = "winter";
	static String seasons[] = {winter, winter, spring, spring, spring, summer,summer,summer,autumn,autumn,autumn,winter};
	public static void main (String args[]) {
		for (int month = 0; month < 12; month++) {
			System.out.println(months[month]+" is a(n) "+seasons[month]+" month with "+monthdays[month]+" days.");		
		}	
	}
	
}
