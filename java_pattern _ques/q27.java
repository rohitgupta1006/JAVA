public class q27 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        while (row<=n)
        {
            int space=4;
            while(space>=row)
            {
                System.out.print("  ");
                space--;
            }
            int s=1;
            while(s<=row)
            {
                System.out.print(s+" ");
                s++;
            }
            int r=row-1;
            while(r>=1)
            {
                System.out.print(r+" ");
                r--;
            }
            System.out.println();
            row++;
        }
    }
}
