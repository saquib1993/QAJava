import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	 public static void main(String[] args) {
	        Scanner scanner = null;
	 
	        try {
	            scanner = new Scanner(System.in);
	            System.out.print("Enter the first integer: ");
	            int numerator = scanner.nextInt();
	 
	            System.out.print("Enter the second integer: ");
	            int denominator = scanner.nextInt();
	 
	            int result = divide(numerator, denominator);
	            System.out.println("The result of the division is: " + result);
	 
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        } catch (InputMismatchException e) {
	            System.out.println("Error: Please enter valid integers.");
	        } catch (NullPointerException e) {
	            System.out.println("Error: Null input encountered.");
	        } finally {
	            if (scanner != null) {
	                scanner.close();
	            }
	            System.out.println("Program has terminated.");
	        }
	    }
	 
	    public static int divide(int numerator, int denominator) {
	        return numerator / denominator;
	    }
	}