import java.util.Scanner;
public class simplecalculater {
    public static void main(String[] args) { // main method
        Scanner s = new Scanner(System.in); //creating object of scanner class for taking input from user
        System.out.println("Enter the first number"); //massage for user
        int num1 = s.nextInt(); //taking input from user 
        System.out.println("Enter the second number"); //massage for user
        int num2 = s.nextInt(); //taking input from user

        System.out.println("Enter the option "); //massage for user
        char option = s.next().charAt(0); //taking input from user
        
        switch (option) { //switch case for performing the operation
            case '+': //case for addition
                {
                    System.out.println("addtion of two numbers is "+(num1+num2)); //printing the addition of two numbers
                    break; //break statement for coming out of the loop 
                 }
            case '-': // case for subtraction
            {
                System.out.println("subtraction of two numbers is "+(num1-num2)); //printing the subtraction of two numbers
                break; //break statement for coming out of the loop
            }
            case '*':
            {
                System.out.println("multiplication of two numbers is "+(num1*num2)); 
                break;
            }
            case '/':
            {
                System.out.println("division of two numbers is "+(num1/num2)); 
                break;
            }
            default: //default case for invalid option 
            {
                System.out.println("Invalid option"); //printing the invalid option 
                break; //break statement for coming out of the loop
            }
        }

    }
        
    
}
