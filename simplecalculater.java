import java.util.Scanner;
public class simplecalculater {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = s.nextInt();
        System.out.println("Enter the second number");
        int num2 = s.nextInt();

        System.out.println("Enter the option ");
        char option = s.next().charAt(0);
        
        switch (option) {
            case '+':
                {
                    System.out.println("addtion of two numbers is "+(num1+num2)); 
                    break;
                 }
            case '-':
            {
                System.out.println("subtraction of two numbers is "+(num1-num2)); 
                break;
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
            default:
            {
                System.out.println("Invalid option"); 
                break;
            }
                
        }

    }
        
    
}
