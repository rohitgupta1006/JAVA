package Assignment_1;

import java.util.Scanner;

public class q14_Pattern_Inverted_Hour_Glass {
    public static void main(String args[]) {
    Scanner Sc = new Scanner(System.in);
    int n = Sc.nextInt();
    int row=1;
    int star=1;
    int space=(2*n)-1;
    Sc.close();


    while (row<=2*n+1) {

        int x=n;
        int i=1;
        while (i<=star) {
            System.out.print(x+"\t");
            x--;
            i++;
        }
        
        i=1;
        while (i<=space) {
            System.out.print("\t");
            i++;
        }
        if(row<=n){space-=2;}
        else {space+=2;}

        i=1;
        while (i<=star) {
            x++;
            if(x!=0){System.out.print(x+"\t");}
            i++;
        }
 
        System.out.println();
        row++;
        if(row<=n+1) {star++;}
        else {star--;}
    }

    }
    
}
