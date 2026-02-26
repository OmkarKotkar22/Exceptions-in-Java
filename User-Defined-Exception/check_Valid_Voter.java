/*user defined exception*/

import java.util.*;
class voterException extends RuntimeException{
	public String getErrorMsg(){
		return "You are not eligible for vote";
	}
}

class checkVoter{
	void validateVoter(int age){
		if(age < 18){
			throw new voterException();
		}

		else{
			System.out.print("Your are eligible");
		}
	}
}


public class check_Valid_Voter{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Age: ");	
		int age = sc.nextInt();
		try{
			checkVoter cv = new checkVoter();
			cv.validateVoter(age);
		}
		catch(voterException ex){
			System.out.print(ex.getErrorMsg());
		}
	}
}