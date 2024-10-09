class A2 
{
    int x,y;
    A2(int a, int b) //parameterized contructor
    {
        x=a; y=b;
    }
    A2(int a, String b) //parameterized
    {
        System.out.println(a+ " "+b);
    }
    void show()
    {
        System.out.println(x+ ""+y);
    }
}
class B2
{
    public static void main(String[] args) {
        A2 r=new A2(100,200);
        r.show();
        A2 ref=new A2(10, "ankush");
    }
}
