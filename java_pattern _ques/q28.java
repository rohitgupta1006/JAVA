import java.util.Scanner;

public class q28 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        sc.close();
        int n=sc.nextInt();
        int row=1;
        int val=1;
        while(row<=n)
        {
    
            int star=1;
            while(star<=row)
            {
                System.out.print(val+" ");
                val++;
                star++;
            }
            System.err.println();
            row++;
        }
    }
}
