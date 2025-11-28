public class q8 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        while (row<=n)
        {
            int col=1;
            while (col<=n)
            {
                if ( row==col || col+row==n+1)
                {
                    System.out.print("*");
                    col++;
                }
                else 
                {
                    System.out.print("  ");
                    col++;
                    
                }
            }
            System.out.println();
            row++;

        }
    }
}
