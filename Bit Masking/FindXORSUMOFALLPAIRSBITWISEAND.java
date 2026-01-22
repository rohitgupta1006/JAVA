import java.util.Scanner;
public class FindXORSUMOFALLPAIRSBITWISEAND {
    public static void main(String[] args) {
        // This is a placeholder for the main method.
        // The actual implementation would go here.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr1 = new int[n];
        int [] arr2 = new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
            arr2[i]=sc.nextInt();
        } 
        int xor1=Bitwise_XOR(arr1);
        int xor2=Bitwise_XOR(arr2);
        System.out.println(xor1 & xor2);

    }
     public static int Bitwise_XOR(int[] derived) {
        int xor = 0;
        for (int v : derived) {
            xor ^= v;
        }
        return xor;
    }
  
}
