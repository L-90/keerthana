package set3;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		int a,b,gcd;
		a=b=gcd=0;
		System.out.println("Enter the nos:");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
	while(a!=0)
		{
			gcd=a;
			a=b%a;
			b=gcd;
		}
		System.out.println("GCD"+gcd);
		s.close();
		
	}

}
