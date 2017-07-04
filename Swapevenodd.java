package set3;

import java.io.CharArrayWriter;
import java.util.Scanner;

public class Swapevenodd {
	public static void main(String[] args) {
		String str;
		char a[];
		System.out.println("enter the string to swap");
		new CharArrayWriter();
		Scanner obj=new Scanner(System.in);
		str=obj.next();
		a=str.toCharArray();
		for(int i=0;i<str.length();i++){
			System.out.println(a[i+1]+" "+a[i]);
			i++;
		
		obj.close();
	}

	}
}
