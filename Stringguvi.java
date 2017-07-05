package set3;

import java.util.Scanner;

public class Stringguvi {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String []str1=str.split("\\s");
        for(String str2:str1){
			StringBuffer a=new StringBuffer(str2);
        	System.out.print(a.reverse().toString()+"");
        	s.close();
        }
	}

}
