package set3;

import java.util.Scanner;

public class StringtoCamelcase {

	public static void main(String[] args) {
	   Scanner scanner=new Scanner(System.in);
	   System.out.println("Enter the Sentence");
	   String result="";
	   String in=scanner.nextLine();
	   char firstchar=in.charAt(0);
	   result=result+Character.toUpperCase(firstchar);
	   for(int i=1;i<in.length();i++){
		   char currentchar=in.charAt(i);
		   char previouschar=in.charAt(i-1);
		if(previouschar==' ') {
			   result=result+Character.toUpperCase(currentchar);
		   }else{
			   result=result+currentchar;
		   }
		   
	   }
	   System.out.println(result);
	   scanner.close();
	}

}
