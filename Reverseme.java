package set3;

import java.util.Scanner;

public class Reverseme {
	public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         String input=scan.next();
         StringBuffer sc=new StringBuffer(input);
         sc.reverse();
         System.out.println(sc);
         char[] vowel={'a','A','e','E','i','I','o','O','u','U'};
         for(int i=0;i<sc.length();i++){
         int index=-1;
         char ch=sc.charAt(i);
         for(int j=0;j<10;j++){
        	 if(ch==vowel[j]){
        		 index=i;
        		 break;
        	 }
         }
        	 if(index!=-1){
        		 sc.deleteCharAt(i);
        	 }
         
         System.out.println(sc);
         scan.close();
         
	}

	}
}
