package Assignment_1;

import java.util.Scanner;

public class question1 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int n = sc.nextInt();
            boolean[] seen = new boolean[n + 1]; // beauties are from 1 to n
            int distinct = 0;

            for (int i = 0; i < n; i++) {
                int b = sc.nextInt();
                if (!seen[b]) {
                    seen[b] = true;
                    distinct++;
                }
            }

            System.out.println(distinct);
        }

        sc.close();
    }
  
}
