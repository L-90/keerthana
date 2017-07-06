package guvi;

import java.util.Scanner;

public class Children {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int child=s.nextInt();
		int unique_pairs=1;
		for(int i=0;i<2*child;i++){
			int pairs=2*child-i;
			if(child!=pairs){
				System.out.println(unique_pairs++);
			s.close();
			}
		}
	}

}
