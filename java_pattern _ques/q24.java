public class q24 {
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
                System.out.print(row+" ");
                s++;
            }
            int r=2;
            while(r<=row)
            {
                System.out.print(row+" ");
                r++;
            }
            System.out.println();
            row++;
        }
    }
}
