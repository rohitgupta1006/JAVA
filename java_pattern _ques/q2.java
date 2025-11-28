public class q2{
    public static void main(String[] args) {
        int n=5;
        int row=1;
        while(row<=n)
        {
            int star=1;
            while(star<=row)
            {
                System.out.print(" * ");
                star++;
            }
            System.out.println();
            row++;
        }
    }

}
