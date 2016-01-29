class Point {
	int x,y;
	Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	Point () {
		x = -1;
		y = -1;
	}
}
class PointCreateAlt {
	public static void main(String args[]) {
		Point p = new Point ();
		System.out.println("x = "+p.x+" y = "+p.y);	
	}
}
