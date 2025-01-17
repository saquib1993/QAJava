
public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {22,21,10,5,2,23,25};
		
		int largest = Integer.MIN_VALUE;
		int Secondlargest = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>largest) {
				Secondlargest = largest;
				largest = arr[i];
			}else if(arr[i]>Secondlargest) {
				Secondlargest = arr[i];
			}
		}
		System.out.println(Secondlargest);
	}

}
