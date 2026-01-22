import java.util.Scanner;

public class NeighboringBitwiseXOR {
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
  
    int [] derived = new int[n];
    for(int i=0;i<n;i++)
    {
        derived[i]=sc.nextInt();
    }
    System.out.println(new NeighboringBitwiseXOR().doesValidArrayExist(derived));
    

  }
   public boolean doesValidArrayExist(int[] derived) {
    int xor=0;
    for(int v:derived)
    {
        xor^=v;
        
    }
    return xor==0;
   }  
  
}
