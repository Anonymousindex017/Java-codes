 // simple inheritance program

public class inherisimple {
    class student{
        int rollno, mark;
        String name;
        void input()
        {
            System.out.println("Enter the rollno, name and mark :");
        }
    }
    
    class ravi extends student{
        void display(){
            rollno=1; name="Ravi"; mark=100;
            System.out.println("Rollno : "+rollno +"Name:"+name+ "Mark:"+mark );
        }
    }
    public static void main(String[] args) {
        ravi r = new inherisimple().new ravi();
        r.input();
        r.display();
    }
}
