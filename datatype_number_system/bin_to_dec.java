package datatype_number_system;

import java.util.Scanner;

public class bin_to_dec {
    public static void main(String[] args) {
        // int n=101100;               //2031+2323= 11020            (4%4=0,carry=4/4=1) ,(6%4=2,carry=6/4=1),(4%4=0,carry=4/4=1),(5%4=1,carry=5/4=1)  
        // int sum=0;                     //1bytes=8bits 
        // int mul=1;
        // while(n>0)
        // {
        //     int rem=n%10;
        //     sum=sum+rem*mul;
        //     n=n/10;
        //     mul=mul*2;
        // }
        // System.out.println(sum); 
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        sc.close();

        for (int i=0;i<=n1;i+=20)
        {
            n2=(5/9)*(i-32);
            System.out.println(i+" "+n2);
        }
        
    }
    
}
