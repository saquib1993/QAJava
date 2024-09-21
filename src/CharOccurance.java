import java.util.HashMap;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str="Syed Saquib";
		String str2= str.replaceAll("\\s", "");
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i<str2.length(); i++) {
			char ch = str2.charAt(i);
			
			if(map.containsKey(ch)) {
				int count =map.get(ch);
				count++;
				map.replace(ch, count);
			}
			else {
				map.put(ch, 1);
			}
		
		}
		
		for(Character key:map.keySet()) {
			System.out.print(key+""+map.get(key));
		}

	}

}
