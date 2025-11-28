package Assignment_1;

import java.util.Scanner;

public class q12_pattern_Double_side_Arrow
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space=n-1;
        int space2=-1;
        int star=1;
        int x=1;
        sc.close();

        for (int row=1;row<=n;row++) {
            for (int i=1;i<=space;i++) {System.out.print("  ");}
            for (int i=1;i<=star;i++) {System.out.print(x+" ");x--;} if(row==1){x++;}
            for (int i=1;i<=space2;i++) {System.out.print("  ");}
            if (star!=1) {for (int i=1;i<=star;i++) {x++;System.out.print(x+" ");}}
            if (row<=(n)/2) {space-=2;space2+=2;star++;x++;}
            else {space+=2;space2-=2;x--;star--;}
            System.out.println();            
        }
    }
}
