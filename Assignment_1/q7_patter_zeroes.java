package Assignment_1;

import java.util.Scanner;

public class q7_patter_zeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int zeroes=-1;
        sc.close();

        for (int row=1; row<=n;row++)
        {
            System.out.print(row+"\t");

            for(int i=1; i<=zeroes;i++)
            {
                System.out.print("0\t");
            }
            if(row!=1)
            {
                System.out.print(row+"\t");
            }
            System.out.println();
            zeroes++;
        }
    }
    }

