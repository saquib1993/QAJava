
public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr = {25,21,20,5,4,3,2};
     int temp = 0;
     
     // sorting in ascending order
     for(int i=0 ; i<arr.length; i++) {
    	 for(int j=i+1 ; j<arr.length; j++) {
    		
    		 if(arr[i]>arr[j]) {
    			 temp = arr[i];
    			 arr[i] = arr[j];
    			 arr[j] = temp;
    			 
    		 }
    		// System.out.println(temp);
    	 }
    	 
     }
     System.out.println();
     System.out.println("Sorted Array");
     for(int i=0 ; i<arr.length; i++) {
    	 System.out.print(arr[i]+" "); 
     }
     
	}

}
