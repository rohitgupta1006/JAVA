package Assignment_1;

import java.util.Scanner;

public class q8_Fibbonacci_Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        sc.close();

        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(a+"\t");
                int c=a+b;
                a=b;
                b=c; 
            }
            System.out.println();
        }
        

    }
}
