package datatype_number_system;

import java.util.Scanner;

public class data_type_demo {
    public static void main(String[] args) {
        byte b=(byte)(420);
		short s=60;
		int i=789;
		long l=6678;
		System.out.println(b);
        i=b;
        int a=032;
        System.out.println(a);
        

        Scanner sc=new Scanner(System.in);
        sc.close();
        b=sc.nextByte();
        s=sc.nextShort();
        i=sc.nextInt();
        l=sc.nextLong();
        System.err.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
    }
}
