// why recursion?
// It helps is in solving bigger/complex problem in a simpler ways
//you can convert recursion problem into iteration and vice-versa.
//space complexicity is not constant because of recusive call

public class numberexample_recursion {
  public static void main(String[] args) {
    print(1);
  }
  public static void print(int n)
  {
    // base condition == condition where our recursion will stop making new calls.
    if(n==5)
    {
      System.out.println(5);
      return;
    }
    System.out.println(n); // body


    // recursive call
    // if you are calling a function again and again,you can treat it as a separate call in the stack
    print(n+1);
  }
}
