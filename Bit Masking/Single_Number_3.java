import java.util.Arrays;

public class Single_Number_3 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 1, 3, 2, 5};

    System.out.println(Arrays.toString(singleNumber(arr)));
  }

  public static int[] singleNumber(int[] nums) {
    int xor = 0;

    for (int i = 0; i < nums.length; i++) {
      xor = xor ^ nums[i];
    }

    int mask = xor & (-xor);

    int a = 0;
    for (int i = 0; i < nums.length; i++) {
      if ((mask & nums[i]) != 0) {
        a = a ^ nums[i];
      }
    }

    int b = xor ^ a;
    return new int[]{a, b};
  }
}
