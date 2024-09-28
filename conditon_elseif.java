import java.util.Scanner;
public class conditon_elseif {

    public static void main(String[] args) {
        int marks;
       System.out.println("Enter the marks");
       Scanner obj=new Scanner(System.in);
       marks=obj.nextInt();
       if(60<=marks && marks<=100)
       {
        System.out.println("You got it First Division");
       }
       else if(45<=marks && marks<=60)
       {
        System.out.println("You got it Second Division");
       }
       else if(35<=marks && marks <=45)
       {
        System.out.println("You got it thirld Division");
       }
       else
       {
        System.out.println("Your Are Failed");
       }
       }
    }
