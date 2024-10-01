public class starpattern { //class name
    public static void main(String[] args) { // main method
        
        int i,j,n=10; // declaring variables and initializing n=10 
        for(i = 0; i < n ; i++) // loop for printing the pattern
        {
            for(j = 0; j < n - i; j++)// loop for printing 
            {
                System.out.print(" 0 "); // printing the pattern
            }
        System.out.println(n - i ); // printing the pattern
        }
    }
}
