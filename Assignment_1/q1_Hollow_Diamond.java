package Assignment_1;

import java.util.Scanner;

public class q1_Hollow_Diamond {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int row=1;
    int star=n;
    int space=1; 
    sc.close();

    while (row<=n) {

        if (row==1 || row==n) {
            int var = 1;
            while (var<=n) {
                System.out.print("* ");
                var++;
            }
        }
        else {
            //star
            int i=1;
            while (i<(star+1)/2) {
                System.out.print("* ");
                i++;
            }
            //space
            int j=1;
            while (j<=space) {
                System.out.print("  ");
                j++;
            }
            //star
            int k=1;
            while (k<(star+1)/2) {
                System.out.print("* ");
                k++;
            }
            //mirror
            if (row<(n+1)/2) {
                star-=2;
                space+=2;
            }
            else {
                star+=2;
                space-=2;
            }
        }
        //next row prep
        System.out.println();
        row++;
    }
        
    }
}
