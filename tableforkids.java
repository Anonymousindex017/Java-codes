import java.util.Scanner; //importing scanner class for taking input from user
public class tableforkids { //class name
    public static void main(String[] args){
        Scanner s = new Scanner(System.in); //creating object of scanner class for taking input from user 
        System.out.println("Enter the number to print the table"); //massage for user 
        int num = s.nextInt(); //taking input from user
        for(int i=1; i<=10; i++) //loop for printing the table of given number
        {
            System.out.println(num+" * " + i + " = " +num*i); //printing the table of given number 
        }
    }
    
}
