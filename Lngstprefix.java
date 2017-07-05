package set3;

import java.util.Scanner;

public class Lngstprefix {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner s=new Scanner(System.in);
		String g=s.nextLine();
         int n=g.length();
         char[] c=new char[100];
         for(int i=0;i<n;i++){
        	 c[i]=g.charAt(i);
         }
   for(int i=0;i<n;i++){
	   int b=(int)c[i];
	   if(b==97){
		   System.out.println("z");
	   }else{
		   System.out.println((char)b);
		   s.close();
	   }
	   }
	}
}
