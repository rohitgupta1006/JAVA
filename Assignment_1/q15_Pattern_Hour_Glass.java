package Assignment_1;

import java.util.Scanner;

public class q15_Pattern_Hour_Glass {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int row=1;
    int star=2*n+1;
    int space=0;
    sc.close();


    while (row<=2*n+1) {
        
        int i=1;
        while (i<=space) {
            System.out.print("\t");
            i++;
        }
        if(row<=n){space++;}
        else {space--;}

        int x=(star-1)/2;

        i=1;
        while (i<=star) {
            System.out.print(x+"\t");
            if (i<=star/2) {x--;}
            else {x++;}
            i++;
        }
        System.out.println();
        row++;
        if(row<=n+1) {star-=2;}
        else {star+=2;}
    }

}
}
