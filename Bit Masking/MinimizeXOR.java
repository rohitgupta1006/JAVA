import java.util.Scanner;

public class MinimizeXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(find_x(num1, num2));
    }

    public static int find_x(int num1, int num2) {
        int set_bit = 0;

        // count set bits in num2
        while (num2 > 0) {
            num2 = (num2 & (num2 - 1));
            set_bit++;
        }

        int x = 0;

        // match highest bits of num1
        for (int i = 30; i >= 0 && set_bit > 0; i--) {
            int mask = (1 << i);
            if ((num1 & mask) != 0) {
                x |= mask;
                set_bit--;
            }
        }

        // fill remaining bits from lowest positions
        for (int i = 0; i <= 30 && set_bit > 0; i++) {
            int mask = (1 << i);
            if ((num1 & mask) == 0) {
                x |= mask;
                set_bit--;
            }
        }

        return x;
    }
}
