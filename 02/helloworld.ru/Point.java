class Point {
	int x,y;
	void init(int x,int y) {
		this.x=x;
		this.y=y;
	}
}
class TwoPointsInit {
	public static void main (String args[]) {
		Point p1 = new Point();
		Point p2 = new Point();
		p1.init(10,20);
		p2.init(42,99);
		System.out.println("x = "+p1.x+" y = "+p1.y);
		System.out.println("x = "+p2.x+" y = "+p2.y);
	}
}
