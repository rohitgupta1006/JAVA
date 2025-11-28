package datatype_number_system;

import java.util.Scanner;

public class Inverse_of_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		sc.close();
		int n=sc.nextInt();
		int sum=0;
		int pos=1;
		while(n>0)
		{
			int rem=n%10;
			sum=(int)(sum+pos*Math.pow(10, rem-1));
			pos++;
			n=n/10;
		}
		System.out.println(sum);
        

    }
    
}
