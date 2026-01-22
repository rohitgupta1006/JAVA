import java.util.Scanner;

public class setTheroyVenn {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++)
    {
      arr[i] = sc.nextInt();
    }
    // CALL THE FUNCTION
    int result = venn_diagram(arr, n);
    System.out.println(result);
    sc.close();
  }

  public static int venn_diagram(int[] arr, int n)
  {
    int l = arr.length;
    int count = 0;

    // start from 1 → skip empty set
    for(int i = 1; i < (1 << l); i++)
    {
      int ans = power_set(arr, i);

      if(set_bit(i) % 2 == 0)
      {
        count -= ans;
      }
      else
      {
        count += ans;
      }
    }
    return count;
  }

  private static int set_bit(int i)
  {
    int c = 0;
    while(i > 0)
    {
      i = (i & (i - 1));
      c++;
    }
    return c;
  }

  // removed unused n parameter
  public static int power_set(int[] arr, int i)
  {
    int ans = 1;
    int idx = 0;

    while(i > 0)
    {
      if((i & 1) != 0)
      {
        ans = ans * arr[idx];
      }
      idx++;
      i >>= 1;
    }
    return ans;
  }
}
