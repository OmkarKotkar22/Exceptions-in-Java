import java.util.*;
public class array_Index_Out_Of_Bound{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;

		try{
			for(int i = 0; i < a.length; i++){
				System.out.print("Elements in array: "+ a[i]);
			}
		}	
		catch(Exception ex){ 
			System.out.print("Errror is: "+ex);
		}
	}
}