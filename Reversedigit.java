package practice;

import java.util.Scanner;

public class Reversedigit {
	public static void main(String[] args) {
		int num,rev=0;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		while(num!=0){
			rev=rev*10;
			rev=rev+num%10;
			num=num/10;
		}
		System.out.println("reverse number is"+rev);
		s.close();

	}

}
