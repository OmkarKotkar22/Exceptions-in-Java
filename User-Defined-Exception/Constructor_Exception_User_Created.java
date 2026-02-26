import java.util.*;
class Voter{
    int age;
    String name;
    Voter(int age, String name){
        if(age < 18){
            throw new IllegalArgumentException("You are not Eligible Voting");
        } 
        this.age = age;
        this.name = name;
    }
    
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Your are Eligible for Vote");
    }
}

public class Constructor_Exception_User_Created{
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String name =sc.nextLine();;
        
        System.out.print("Enter the Age: ");
        int age = sc.nextInt();
        
       try{
            Voter v = new Voter(age, name);
            v.display();
       }
        catch(IllegalArgumentException ex){
            System.out.print("Exception is: "+ ex);
        }
    }
}