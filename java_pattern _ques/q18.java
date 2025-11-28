public class q18 {
    public static void main(String[] args) {
        int n=7;
        int row=1;
        int star=1;
        while(row<=n)
        {
            int space=3;
            while(row<=space)
            {
                System.out.print("  ");
                space++;
            }
            int s=1;
            while(s<=star)
            {
                System.out.print("* ");
                if (row<4)
                {
                    star+=2;
                    space--;

                }
                else
                {
                    space++;
                    star-=2;
                    
                }
                s++;
            }
            System.out.println();
            row++;
        }
    }
}
