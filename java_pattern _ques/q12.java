public class q12 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        while(row<=n)
        {
            int space=n-1;
            while(space>=row)
            {
                System.out.print("   ");
                space--;
            }
            int star=1;
            while(star<row)
            {
                if (star%2!=0)
                {
                    System.out.print(" * ");
                    star++;
                }
                else
                {
                    System.out.print(" ! ");
                    star++;
                }
            }
            

            int s=row;
            while(s>=1)
            {
                if (s%2!=0)
                {
                    System.out.print(" * ");
                    s--;
                }
                else
                {
                    System.out.print(" ! ");
                    s--;
                }
                
            }
            System.out.println();
            row++;
            
        }
    }
}
