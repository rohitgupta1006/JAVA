import java.util.Scanner;

public class BitwiseXORofAllPairings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }

        int result = All_Pairing(arr1, arr2);
        System.out.println(result);
    }

    public static int All_Pairing(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        if (n % 2 == 0 && m % 2 == 0) {
            return 0;
        }

        int xor1 = Bitwise_XOR(arr1);
        int xor2 = Bitwise_XOR(arr2);

        if (n % 2 == 1 && m % 2 == 1) {
            return xor1 ^ xor2;
        } else if (n % 2 == 1) {
            return xor2;
        } else {
            return xor1;
        }
    }

    public static int Bitwise_XOR(int[] derived) {
        int xor = 0;
        for (int v : derived) {
            xor ^= v;
        }
        return xor;
    }
}
