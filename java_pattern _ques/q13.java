public class q13 {
    public static void main(String[] args) {
        int  row=1;
        int  n=5;
        while( row<=n)
        {
            int star=1;
            while(star<=row)
            {
                System.out.print("*"+" ");
                star++;
            }
            System.out.println();
            row++;
        }
        int r=1;
        int m=5;
        while(r<=m)
        {
            int j=4;
            while(j>=r)
            {
                System.out.print("*"+" ");
                j--;
            }
            System.out.println();
            r++;
        }
    }
}
