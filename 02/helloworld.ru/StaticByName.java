class StaticClass {
	static int a = 42;
	static int b = 99;
	static void callme() {
		System.out.println("a = "+a);	
	}
}
class StaticByName {
	public static void main(String args[]) {
		StaticClass.callme();
		System.out.println("b = "+StaticClass.b);
	}
}
