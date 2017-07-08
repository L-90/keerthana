package guviprgm;

import java.util.Scanner;

public class Prgm4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x,i=1;
		int sum=0;
		x=s.nextInt();
		while(i<=x) {
			sum=sum+i;
			i++;
		
	}
System.out.println("sum of "+x+" number is:"+sum);
s.close();
	
		
	}

}
