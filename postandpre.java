import java.util.Scanner; //importing scanner class for taking input from user
public class postandpre {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: "); //massage for user 
        int a=s.nextInt();  //taking input from user
        System.out.println("Number is "+a); //printing the number
        System.out.println("post increment "+ a++); //post increment
        System.out.println("Now Number "+a); //post increment result will be 11
        System.out.println("pre increment "+ ++a); //pre increment 
        System.out.println("Now Number "+a); //pre increment result will be 12
        System.out.println("post decrement "+ a--); //post decrement
        System.out.println("Now Number "+a); //post decrement result will be 11
        System.out.println("pre decrement "+ --a); //pre decrement
        System.out.println("Now Number "+a); //pre decrement result will be 10
    }
    
}
