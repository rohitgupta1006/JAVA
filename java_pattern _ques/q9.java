public class q9 {
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
            int s=2;
            while(s<=row)
            {
                System.out.print("*"+" ");
                s++;
            }
            System.out.println();
            row++;
            space++;
        }
    }
}
