public class Magic_number {
  public static void main(String[] args)
  {
    int n=9;

  }
  public static int NthNumber(int n)
  {
    int mul=5;
    int ans=0;
    while(n>0)
    {
      if((n&1) !=0)
      {
        ans=ans+mul;
      } 
    }
  }
  
}
