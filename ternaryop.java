import java.util.Scanner;

public class ternaryop {
    public static void main(String[] args) {
        int a,b,c,r;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        a=s.nextInt();
        System.out.println("Enter the second number :");
        b=s.nextInt();
        System.out.println("Enter the thirld number :");
        c=s.nextInt();
        r=(a>b)?(a>c?a:c):(b>c? b:c);
        System.out.println("Lagerst Number : "+r);

        
    }
}
