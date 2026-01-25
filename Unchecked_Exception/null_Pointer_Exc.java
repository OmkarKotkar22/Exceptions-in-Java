import java.util.*;
public class null_Pointer_Exc{
	static int a[];
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);

		try{
			//a = new int[5];    							   // memory allocate to array
			a[0] = 100;     								 // no memory only put value without memory we are enable to put value  
			System.out.printf("Index 0th Value: %d", a[0]);	
 		}
		catch(NullPointerException ex){
			System.out.print("Error is: "+ ex);
		}
	}
}