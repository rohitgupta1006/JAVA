public class q7 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        while(row<=n)
        {
            int col=1;
            while(col<=n)
            {
                if (row==1 || row==5 || col==1 || col==5)
                {
                    System.out.print("  *");
                    col++; 
                }
                else
                {
                    System.out.print("   ");
                    col++;
                }
            }
            System.out.println();
            row++;
        }
    }
}
