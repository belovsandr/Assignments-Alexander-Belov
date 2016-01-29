abstract class A {
	abstract void callme();
	void metoo() {
		System.out.println("Inside A's metoo method");	
	}
}
class B extends A {
	void callme() {
		System.out.println("Inside B's callme method");	
	}
}
class Abstract {
	public static void main(String args[]) {
		A a = new B();
		a.callme();
		a.metoo();
	}
}
