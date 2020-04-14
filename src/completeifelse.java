/*Determines if an input number is above, below or equal to 10.*/
import java.util.Scanner;
public class completeifelse {
    public static void main(String []args ){
        int number = 10;
        Scanner s = new Scanner (System.in);
        while (true){
        System.out.println("Please enter a number");
        number = s.nextInt();
        if (number > 10){
            System.out.println("Number is biggger than 10.");
        }
        else if (number < 10){
            System.out.println("Number is smaller than 10");
        }
        else if (number ==10){
            System.out.println("Number is equal to 10");
        }
        else {
            System.out.println("somthing major must have went wrong");
        }
    }}
}
