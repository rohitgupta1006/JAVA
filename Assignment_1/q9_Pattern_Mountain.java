package Assignment_1;

import java.util.Scanner;

public class q9_Pattern_Mountain
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space=n*2-3;
        int x=0;
        sc.close();

        for (int row=1;row<=n;row++){
            for(int i=1;i<=row;i++){x++;System.out.print(x+"\t");}
            for(int i=1;i<=space;i++){System.out.print("\t");}
            for(int i=1;i<=row;i++){if(x!=n){System.out.print(x+"\t");}x--;}
            space-=2;
            System.out.println();
        }
    }
}