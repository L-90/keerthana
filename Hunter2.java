package guvi;

import java.util.Scanner;

public class Hunter2 {
	public  static void main(String[] args){
		Scanner s= new Scanner(System.in);
	    int  n=s.nextInt();
	    System.out.println("enter the elemennts");
	    int[] arr=new int[n];
	   
	    for(int i=0;i<n;i++){
	    	arr[i]=s.nextInt();
	    }
	    for(int i=0;i<n;i++){
	    	for(int j=0;j<n;j++){
	    		for(int k=0;k<n;k++){
	    			if(arr[i]+arr[j]==arr[k])
	    				System.out.println("ELEMENT i,j,k IS:="+arr[i]+arr[j]+arr[k]);
	    				s.close();
	    			}
	    		}
	    			
	    		}
	    }
	}

	    	
	    
	    