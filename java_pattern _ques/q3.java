public class q3 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        while(row<=n)
        {
            int star=5;
            while(star>=row)
            {
                System.out.print(" * ");
                star--;
            }
            System.out.println();
            row++;

        }
    }
    

}
