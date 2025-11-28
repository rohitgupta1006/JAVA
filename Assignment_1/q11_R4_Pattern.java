package Assignment_1;

import java.util.Scanner;

public class q11_R4_Pattern {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        sc.close();

        while(row<=n)
        {
            int col=1;
            while(col<=row)
            {
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
            
        }
    }
}
