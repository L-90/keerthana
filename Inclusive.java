
package set3;

public class Inclusive {
	public static void main(String[] args) {
		int sum=0,odd=0;
		for(int i=1;i<=15;i++){
			sum=sum+i;
		}
		for(int j=15;j<=45;j++){
			if(j%2==1){
				odd=odd+j;
			}
	
	}
		System.out.println("the number of sum is "+sum+" \n and sum of odd number is"+odd);
}
}