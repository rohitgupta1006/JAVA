package Assignment_1;

import java.util.Scanner;

public class q2_Pattern_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int star=1;
		int row=1;
		int space=n-1;
		int c=1;
		sc.close();

		while (row<=n) {
			int i=1;
			while (i<=space) {
				System.out.print("\t");
				i++;
			}
			i=1;
			c=row;
			while (i<=star) {
				System.out.print(c);System.out.print("\t");
				if(i<row) {c++;}
				else {c--;}
				i++;
			}
			star+=2;
			space--;
			System.out.println();
			row++;
        }

    }
}
