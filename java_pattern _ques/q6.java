public class q6 {
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
    }
}
