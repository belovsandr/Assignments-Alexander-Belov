class Callme {
	void call (String msg) {
		System.out.println("["+msg);
		try {
			Thread.sleep(1000);
		}
		catch (Exception e) {}
		System.out.println("]");	
	}
}
class Caller implements Runnable {
	String msg;
	Callme target;
	public Caller (Callme t, String s) {
		target = t;
		msg = s;
		new Thread(this).start();
	}
	public void run() {
		target.call(msg);	
	}
}
class Synch {
	public static void main(String args[]) {
		Callme target = new Callme();
		new Caller(target,"Hello");
		new Caller(target,"Synchronized");
		new Caller(target, "World");
	}
}
