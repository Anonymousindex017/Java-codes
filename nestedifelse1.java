public class nestedifelse1 {

    public static void main(String[] args)
    {
        int num1=20,num2=100, num3=45;
        if(num1>num2)
        {
            if(num1>num3)
            {
                System.out.println("maximum number:"+num1);
            }
            else
            {
                System.out.println("maximum number:"+num3);
            }
        }
        else
        {
            if(num2>num3)
            {
                System.out.println("maximum number:"+num2);
            }
            else
            {
                System.out.println("maximum number:"+num3);
            }
        }
    }
}