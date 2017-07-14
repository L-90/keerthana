package gvi;

import java.util.Scanner;

public class Maxstring {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		StringBuffer rev=new StringBuffer(str);
		if(rev.reverse().toString().equals(str)){
		System.out.println("Maximum substring length :"+(str.length()-1));
		}
		else{
		System.out.println("Maximum substring length :"+str.length());
		}
		input.close();
	}

	}


