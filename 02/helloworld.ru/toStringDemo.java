class Point {
	int x,y;
	Point (int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "Point["+x+", "+y+"]";
	}
}
class toStringDemo {
	public static void main(String args[]) {
		Point p = new Point(10,20);
		System.out.println("p = "+p);
	}
}
