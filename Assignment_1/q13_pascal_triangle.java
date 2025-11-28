package Assignment_1;

import java.util.Scanner;

public class q13_pascal_triangle {
    static int factorial(int i) {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }
    static int C(int n, int r) {
        return factorial(n)/(factorial(n-r)*factorial(r));
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int row=0;row<n;row++) {
            for (int i=0;i<=row;i++) {
                System.out.print(C(row,i)+"\t");
            }
            System.out.println();
        }
    }
}
