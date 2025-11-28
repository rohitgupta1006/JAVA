public class fibonacci {
    public static void main(String[] args) {
        int ans = fibo(4);   // fibo(4) = 3
        System.out.println(ans); // prints 3
    }

    public static int fibo(int n) {
        if (n < 2) 
        {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
