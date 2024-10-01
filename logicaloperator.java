//discribe the logical operator in java
import java.util.Scanner; //importing scanner class for taking input from user
public class logicaloperator { //class name
    public static void main(String[] args) { //main method
        Scanner s = new Scanner(System.in); //creating object of scanner class for taking input from user
        System.out.println("Enter First numbers: "); //massage for user
        int a=s.nextInt(); //taking input from user
        System.out.println("Enter Second numbers: "); //massage for user
        int b=s.nextInt(); //taking input from user

        System.out.println(a>b && a<b); //using and operator

        System.out.println(a>b || a<b); //using or operator

        System.out.println(!(a>b && a<b)); //using not operator
        
        System.out.println(!(a>b || a<b)); //using not operator
    }
    
}
