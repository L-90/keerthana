package set3;

import java.util.Scanner;

public class Countword {
	public static void main(String[] args) {
     System.out.println("Enter the string");
     Scanner s=new Scanner(System.in);
     String str=s.nextLine();
     int count=0;
     for(int i=0;i<str.length();i++){
    	 count++;
     }
System.out.println(count);
s.close();
}
}