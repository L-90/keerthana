package guviprgm;

import java.util.Scanner;

public class Prgm3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=s.next().charAt(0);
		if(ch=='Q'||ch=='q') {
			System.out.println("prgm is exit");
		}
		else {
			System.out.println("prgm is continue");
			s.close();
		}
	}

}
