public class q21 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        
        while(row<=n)
        {
            int star=1;
            while(star<=row)
            {
                System.out.print("* ");
                star++;
            }
            int space=((2*n)-star);
            while(space>=row)
            {
                System.out.print("  ");
                space--;
            }
            int st=1;
            while(st<=row)
            {
                System.out.print(" *");
                st++;
            }
            System.out.println();
            row++;
        }
        
    }
    
}
