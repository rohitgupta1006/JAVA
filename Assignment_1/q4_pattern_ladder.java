package Assignment_1;

import java.util.Scanner;

public class q4_pattern_ladder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int val=1;
        sc.close();

        
        while(row<=n)
        {
    
            int star=1;
            while(star<=row)
            {
                System.out.print(val+"\t");
                val++;
                star++;
            }
            System.out.println();
            row++;
        }
    }
}
