public class q22 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        
        while(row<=n)
        {
            int star=5;
            while(star>=row)
            {
                System.out.print(" *");
                star--;
            }
            int space=(n-row);
            while(space<=row)
            {
                System.out.print("  ");
                space++;
            }
            int st=5;
            while(st>=row)
            {
                System.out.print(" *");
                st--;
            }
            System.out.println();
            row++;
            space++;
        }
    }
    
}
