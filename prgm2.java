package guviprgm;

import java.util.Scanner;

public class prgm2 {
	public static void main(String[] args) {
		int digit = 0,letter = 0,alpha = 0;
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int len=str.length();
		for(int i=0;i<len;i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(i)){
				digit++;
				
			}
			if(Character.isLetter(i)) {
				letter++;
			}
				else {
					alpha++;
				}
			System.out.println(digit);
			System.out.println(letter);
			System.out.println(alpha);
			s.close();
				}
			}
		}
	


