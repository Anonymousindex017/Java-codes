import java.util.Scanner;
public class conditionif {
    public static void main(String[] args) {
        int pswd;
        System.out.println("Enter your password");
        Scanner obj=new Scanner(System.in);
        pswd=obj.nextInt();
        if (pswd==4444){
            System.out.println("Welcome to your account");
            System.out.println("My name - RAvi kahshyap");
            System.out.println("My age - 21");
            System.out.println("Email - ravi.kashyap181855@gmail.com");
        }
        else{
            System.out.println("Incorrect password");
        }
    }
}
