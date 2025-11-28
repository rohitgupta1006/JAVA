package Assignment_1;

import java.util.Scanner;

public class q3_Mirror_star_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    int row=1;
    int star=1;
    int space=(n-1)/2; 
    sc.close();


    while (row<=n){
        
        //space
        int j=1;
        while (j<=space) {
            System.out.print("  ");
            j++;
        }
        //star
        int k=1;
        while (k<=(star+1)/2) {
            System.out.print("* ");
            k++;
        }
        //mirror
        if (row<(n+1)/2) {
            star+=4;
            space--;
        }
        else {
            star-=4;
            space++;
        }
        //next row prep
        System.out.println();
        row++;
    }
    }
}