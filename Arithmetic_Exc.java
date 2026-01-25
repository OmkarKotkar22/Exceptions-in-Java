import java.util.*;
public class Arithmetic_Exc{
	static public void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Number: ");
		int a = sc.nextInt();

		System.out.print("Enter the Second Number: ");
		int b = sc.nextInt();

		int div = 0;
		try{
			div = a / b;
			System.out.printf("Answer is: %d", div);			
		}
		catch(ArithmeticException ex){
			System.out.print("Error is: "+ ex);
		}
	}
}