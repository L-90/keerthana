package gvi;

import java.util.Arrays;
import java.util.Scanner;

public class Pro3 {
      public static void main(String[] args){
    	  int k;
  		int number;
  		Scanner s=new Scanner(System.in);
  		try{
  			System.out.println("Enter the digits to be removed ");
  			k=s.nextInt();
  			System.out.println("Enetr the number:");
  			number=s.nextInt();
  			String str=""+number;
  			if(k<str.length()&&k>0){
  				char[] numberArray=str.toCharArray();
  				Arrays.sort(numberArray);
  			str =" ";
            for(int i=0;i<numberArray.length-k;i++){
          	  str+=numberArray[i];
            }
          	  System.out.println(Integer.parseInt(str));
            }else{
          	  System.out.println("invalid enter the correct details");
            }
  		}
  			catch(Exception exception){
          	  System.out.println(exception);
          	  s.close();
  			}
  	}
  
}     	  
            
  		
  	


            


      

