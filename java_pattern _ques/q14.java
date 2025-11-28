public class q14 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        while(row<=n)
        {
            int space=4;
            while(space>=row)
            {
                System.out.print("  ");
                space--;
            }
            int star=1;
            while(star<=row)
            {
                System.out.print("*"+" ");
                star++;
            }
            System.out.println();
            row++;
        }
        int m=5;
        int r=1;
        while(r<=m)
        {
            int s=1;
            while(s<=r)
            {
                System.out.print("  ");
                s++;
            }
            int a=4;
            while(a>=r)
            {
                System.out.print("*"+" ");
                a--;
            }
            System.out.println();
            r++;
        }
    }
}
