package set3;

import java.util.Scanner;

public class Subseta1anda2 {
    public static void subset(int[] arr,int[]arr1){
    	int count=0;
    	for(int i=0;i<arr.length;i++){
    		count=0;
    		for(int j=0;j<arr1.length;j++){
    			if(arr[i]==arr1[j]){
    				count++;
    			}
    		}
    		if(count==0){
    			System.out.println("not a subset");
    			System.exit(0);
    		}
    	}
    	System.out.println("array1 is a subset os array2");
    			
    		}
	public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("enetr the array1");
       int len=scan.nextInt();
       System.out.println("enter the array2");
      int len1=scan.nextInt(); 
      int arr[]=new int[len];
      int arr1[]=new int[len1];
      System.out.println("enter the array 1 elements");
      for(int i=0;i<len;i++){
    	  arr[i]=scan.nextInt();
      }
      System.out.println("enter the array 2 elements");
        for(int i=0;i<len1;i++){
        	arr[i]=scan.nextInt();
        }
	subset(arr,arr1);
	scan.close();

}
}
