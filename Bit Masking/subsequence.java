public class subsequence {
  public static void main(String[] args) 
  {
    String s="abc";
    Subsequence(s);
  }
  public static void Subsequence(String s)
  {
    int n=s.length();
    for(int i=0;i<(1<<n); i++)      // 1<<n == 1 mai multiply karo 2 ki power mai 1
    {
      Pattern(s,i);
    }
  }
  private static void Pattern(String s,int i)
  {
    int idx=0;
    String ans="";
    while(i>0)
    {
      if((i&1) == 1)
      {
        ans=ans+s.charAt(idx);
      }
      i >>= 1;
      idx++;
    }
  } 
}
