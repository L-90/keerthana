package set3;

import java.util.Scanner;

public class Positive {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] a=new int[10];
		int b=scan.nextInt();
		int c=0,d=0;
		for(int i=0;i<b;i++){
			a[i]=scan.nextInt();
		}
		for(int i=0;i<=b;i++){
			for(int j=0;j<b&&i!=j;j++){
				if(a[i]-a[j]==0||a[i]+a[j]==0){
					c=i;
					d=j;
					break;
				}
			System.out.println("the two elements arae"+a[c]+"\n"+a[d]);
			scan.close();
			}
		}
	}

}
