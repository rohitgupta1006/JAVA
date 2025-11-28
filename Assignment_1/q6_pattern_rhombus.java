package Assignment_1;

import java.util.Scanner;

public class q6_pattern_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 1;
        int star = 1;
        int space = n - 1;
        int row = 1;
        sc.close();

        
        while (row <= 2 * n - 1) {
            for (int i = 1; i <= space; i++) {
                System.out.print("\t");
            }
            
            int p = val;
            for (int j = 1; j <= star; j++) {
                System.out.print(p + "\t");
                if (j <= star / 2) {
                    p++;
                } else {
                    p--;
                }
            }
            
            System.out.println();
            if (row < n) {
                star += 2;
                space--;
                val++;
            } else {
                star -= 2;
                space++;
                val--;
            }
            
            row++;
        }
    }
}