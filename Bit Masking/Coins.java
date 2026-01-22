import java.util.*;

public class Coins {
  public static void main (String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double[] arr = new double[n];
    for(int i = 0; i < n; i++)
    {
      arr[i] = sc.nextDouble();
    }
    int m = arr.length;
    double[][] dp = new double[(n+1)/2 + 1][m + 1];
    for(double[] a : dp)
    {
      Arrays.fill(a, -1.0);   
    }
    System.out.println(probability(arr, (n+1)/2, 0, dp));
    sc.close();
  }

  public static double probability(double[] p, int h, int i, double[][] dp)
  {
    if(h == 0)
    {
      return 1.0;
    }
    if(i == p.length)
    {
      return 0.0;
    }
    if(dp[h][i] != -1.0) 
    {
      return dp[h][i];
    }
    double head = p[i] * probability(p, h-1, i+1, dp);
    double tail = (1.0 - p[i]) * probability(p, h, i+1, dp);
    return dp[h][i] = head + tail;
  }
}
