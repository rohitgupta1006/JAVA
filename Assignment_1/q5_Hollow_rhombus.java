package Assignment_1;

import java.util.Scanner;

public class q5_Hollow_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int row = 1;
    int star = n;
    int space = n-1;
    sc.close();

    
    while (row<=n) {

        int x=1;
        while (x<=space) {
            System.out.print(" ");
            x++;
        }
        // star
        if (row==1 || row==n) {
            int j=1;
            while (j<=star) {
                System.out.print("*");
                j++;
            }
        } 
        else {
            System.out.print("*");
            for (int i=1;i<=n-2;i++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
        // next row prep
        System.out.println();
        row++;
        space--;
        
    }
    
    }
}
