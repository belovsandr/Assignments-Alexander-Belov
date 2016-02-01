class ThreadDemo implements Runnable {
	ThreadDemo() {
		Thread ct = Thread.currentThread();
		System.out.println("currentThread: "+ct);
		Thread t = new Thread(this,"Demo Thread");
		System.out.println("Thread created: "+t);
		t.start();
		try {
			Thread.sleep(3000);		
		}
		catch (InterruptedException e) {
			System.out.println("interrupted");
		}
		System.out.println("exiting main thread");
	}
	public void run() {
		try {
			for (int i=5;i>0;i--) {
				System.out.println(""+i);
				Thread.sleep(1000);			
			}		
		}
		catch (InterruptedException e) {
			System.out.println("child interrupted");		
		}
		System.out.println("exiting child thread");	
	}
	public static void main (String args[]) {
		new ThreadDemo();
	}
}
