package guvi;

import java.util.Scanner;

public class Hunter3 {
	public static void main(String[] args){
		int n,p;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			p=arr[i];
			for(int j=i+1;j<n;j++){
				if(p==arr[j]){
					System.out.println("first repeated integer is:"+p);
					s.close();
				}
		}
	}
}
}