package set3;

import java.util.Scanner;

public class HCF2num {

	public static void main(String[] args) {
		int n1,n2,hcf=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first numbers");
		n1=s.nextInt();
		System.out.println("enter the second number");
		n2=s.nextInt();
		int min=Math.min(n1, n2);
		for(int i=min;i>=1;i--){
			if((n1%i==0)&&(n2%i==0)){
				hcf=i;
				break;
			}
		}
			System.out.println("hcf of two given number is"+hcf);
			s.close();
		}
	}


