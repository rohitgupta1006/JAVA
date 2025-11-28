package datatype_number_system;

public class dec_to_bin {
    public static void main(String[] args) {
        int n=38;
        int sum=0;
        int mul=1;
        while(n>0)
        {
            int rem=n%2;
            sum=sum+rem*mul;
            n=n/2;
            mul=mul*10;
        }
        System.out.println(sum); 
    }
    
}
