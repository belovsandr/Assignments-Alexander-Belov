class WordCount{
	static String text = "Now is the time\n"+
			     "for all good men\n"+
			     "to come to the aid\n"+
			     "of their party\n";
	static int len = text.length();
	public static void main (String args[]) {
		boolean inWord = false;
		int numChars = 0;
		int numWords = 0;
		int numLines = 0;
		for (int i=0; i<len;i++) {
			char c = text.charAt(i);
			numChars++;
			switch (c) {
				case '\n': numLines++;
				case '\t':
				case ' ': if (inWord) {
						numWords++;
						inWord = false;
					}
					break;
				default: inWord = true;				
			}
		}
		System.out.println(text);
		System.out.println("Number of lines: "+numLines+"\nNumber of words: "+numWords+"\nNumber of characters: "+numChars);	
	}
}
