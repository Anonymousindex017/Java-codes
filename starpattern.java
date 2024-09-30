public class starpattern {
    public static void main(String[] args) {
        
        int i,j,n=10;
        for(i=0;i<n;i++)
        {
            for(j=0; j<n-i-1;j++);
            {
                System.out.print("0 ");
            }
            System.out.println(n-i);
        }
    }
}
