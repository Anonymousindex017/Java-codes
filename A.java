class A{
    
    int a; String b; boolean c;
        A()
        {
            a=100; b="ravi"; c=false;
        }
        void disp()
        {
            System.out.println(a +" " +b +" " +c);
        }
    }
    
    class B
    {
        public static void main(String[] args) {
            A r=new A();
            r.disp();
        }
    }
    
