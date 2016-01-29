class Point {
	int x,y;
	Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	double distance(int x, int y) {
		int dx = this.x - x;
		int dy = this.y - y;
		return Math.sqrt(dx*dx + dy*dy);	
	}
	double distance(Point p) {
		return distance(p.x, p.y);	
	}
}
class Point3D extends Point {
	int z;
	Point3D (int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	double distance (int x,int y,int z) {
		int dx = this.x - x;
		int dy = this.y - y;
		int dz = this.z - z;
		return Math.sqrt(dx*dx+dy*dy+dz*dz);
	}
	double distance (Point3D other) {
		return distance(other.x, other.y, other.z);
	}
	double distance (int x, int y) {
		double dx = (this.x/z) - x;
		double dy = (this.y/z) - y;
		return Math.sqrt (dx*dx+dy*dy);
	}
}
class Point3DDist {
	public static void main(String args[]) {
		Point3D p1 = new Point3D (30, 40, 10);
		Point3D p2 = new Point3D (0, 0, 0);
		Point p = new Point (4,6);
		System.out.println("p1 = "+p1.x+", "+p1.y+", "+p1.z);
		System.out.println("p2 = "+p2.x+", "+p2.y+", "+p2.z);
		System.out.println("p = "+p.x+", "+p.y);
		System.out.println("p1.distance(p2) = "+p1.distance(p2));
		System.out.println("p1.distance(4,6) = "+p1.distance(4,6));
		System.out.println("p1.distance(p) = "+p1.distance(p));	
	}
}
