public class newstr {
    public static void main(String[] args) {
        int n = 10; // Starting number

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n - i; j++) 
            {
                System.out.print("0 ");
            }
            System.out.println(n - i);
        }
    }
}
