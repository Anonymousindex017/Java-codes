import java.util.Scanner;
public class createtable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to print the table");
        int num =s.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(num*i);
        }
    }
}