
public class RevSentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Automation is fun";
		
		String[] words = str.split(" ");
		//Reversing individual sentence
		for(String w: words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			System.out.print(" ");
			System.out.print(sb);
		}
		
	}

}