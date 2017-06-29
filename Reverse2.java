package set3;

import java.util.Scanner;

public class Reverse2 {

	public static void main(String[] args) {
		int rev=0,num=6758;
		 Scanner s=new Scanner(System.in);
		 while(num!=0){
			 rev=(rev*10)+(num%10);
					 num=num/10;
		 }
					System.out.println("reverse the number is:"+rev);
					s.close();
		}

	}

	

