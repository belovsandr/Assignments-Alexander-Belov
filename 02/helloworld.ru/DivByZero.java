class DivByZero {
	public static void main(String args[]) {
		try {
			int d = 0;
			int a = 42 / d;
		}
		catch (ArithmeticException e) {
			System.out.println("division by zero");		
		}	
	}
}
