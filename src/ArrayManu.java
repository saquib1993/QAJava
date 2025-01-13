import java.util.Arrays;
import java.util.Scanner;

public class ArrayManu {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 15, 25, 5, 30, 50, 40, 35, 45};

        // Print Array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Reverse Array
        reverseArray(numbers);
        System.out.println("Reversed Array: " + Arrays.toString(numbers));

        // Find Maximum and Minimum
        int max = findMax(numbers);
        int min = findMin(numbers);
        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);

        // Sum and Average
        int sum = calculateSum(numbers);
        double average = calculateAverage(numbers);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        // Search Element
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an element to search: ");
        int element = scanner.nextInt();
        int index = searchElement(numbers, element);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

        // Sort Array
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }

    // Reverse the array in-place
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Find the maximum value in the array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Find the minimum value in the array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Calculate the sum of all elements in the array
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Calculate the average of the array
    public static double calculateAverage(int[] arr) {
        return calculateSum(arr) / (double) arr.length;
    }

    // Search for an element in the array
    public static int searchElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
