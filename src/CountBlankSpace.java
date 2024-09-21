
public class CountBlankSpace {

	public static void main(String[] args) {
		String str = "U S E RTest";
		int count=0;
		
		for (int i = 0 ; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == ' ') {
				
				count++;
			}
		}
		
		System.out.println("Blank Spaces Are : "+count);
	}

}
