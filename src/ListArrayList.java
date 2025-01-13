import java.util.ArrayList;
import java.util.List;

public class ListArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		 System.out.println("List: " + list);
		 
	        // 4. Remove the integer at index 2
	        list.remove(2);
	 
	        // 5. Print the list again
	        System.out.println("List after removing element at index 2: " + list);
	 
	        // 6. Add the integer 25 at index 2
	        list.add(2, 25);
	 
	        // 7. Print the list
	        System.out.println("List after adding 25 at index 2: " + list);
	 
	        // 8. Find and print the maximum value in the list
	        int max = findMax(list);
	        System.out.println("Maximum value in the list: " + max);
	 
	        // 9. Find and print the sum of all values in the list
	        int sum = findSum(list);
	        System.out.println("Sum of all values in the list: " + sum);
	    }
	 
	    // Method to find the maximum value in the list
	    public static int findMax(List<Integer> list) {
	        int max = list.get(0);
	        for (int num : list) {
	            if (num > max) {
	                max = num;
	            }
	        }
	        return max;
	    }
	 
	    // Method to find the sum of all values in the list
	    public static int findSum(List<Integer> list) {
	        int sum = 0;
	        for (int num : list) {
	            sum += num;
	        }
	        return sum;

	}

}
