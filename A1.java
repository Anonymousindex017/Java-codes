class A1
{

        int a; String b; boolean c;
        A1()   //default contructor 
        {
            a=1020; b="Ravi"; c=false;
        }
        void disp()
        {
            System.out.println(a+ " "+b+ " "+c);
        }
    
}

class B1
{
    public static void main(String[] args) {
        A1 r=new A1();
        r.disp();
    }
}
