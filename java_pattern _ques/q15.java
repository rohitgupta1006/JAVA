public class q15
 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        while(row<=n)
        {
            int space=2;
            while(space<=row)
            {
                System.out.print("      ");
                space++;
            }
            int star=5;
            while(star>=row)
            {
                System.out.print("*  ");
                star--;
            }
            System.out.println();
            row++;
            space+=2;

        }
        int r=2;
        while (r<=n)
        {
            int s=n+3;
            while(s>=row)
            {
                System.out.print("   ");
                s--;
            }
            int st=1;
            while(st<=r)
            {
                System.out.print("  *");
                st++;
            }
            System.out.println();
            r++;
            s+=2;
        }
        
    }
}
