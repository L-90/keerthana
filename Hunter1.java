package guvi;

import java.util.Scanner;

public class Hunter1 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		int arr[]=new int[a];
	for(int i=0;i<a;i++){
		arr[i]=s.nextInt();
		}
	System.out.println("output1:");
	for(int i=0;i<a;i++){
		System.out.println(+arr[a-1-i]+" \t");
	}
	s.close();
	}

}
