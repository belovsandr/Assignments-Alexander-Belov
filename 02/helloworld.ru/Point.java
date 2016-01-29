class Point {
	int x,y;
	Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
}
class PointCreate {
	public static void main(String args[]) {
		Point p = new Point (10,20);
		System.out.println("x = "+p.x+" y = "+p.y);	
	}
}
