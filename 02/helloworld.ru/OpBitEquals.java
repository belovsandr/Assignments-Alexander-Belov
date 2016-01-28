class OpBitEquals {
	static public void main (String args[]) {
		int a = 1;
		int b = 1;
		int c = 3;
		a |= 4;
		b >>= 1;
		c <<= 1;
		a ^= c;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}
}
