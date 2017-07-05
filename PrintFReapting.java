package set3;

import java.util.HashSet;

public class PrintFReapting {
	static void PrintFirstRepeating(int arr[]){
		int min=-1;
		HashSet<Integer> Set=new HashSet <> ();
		for(int i=arr.length-1;i>=0;i--){
			if(Set.contains(arr[i])){
				min=i;
			}
				else
					Set.add(arr[i]);
			}
			if(min!=-1)
				System.out.println("The first repeating element is"+arr[min]);
			else
				System.out.println("there is no repeating element");
		
	}
	public static void main(String[] args) {
		int arr[]={10,4,5,6,7,8,7,4};
		PrintFirstRepeating(arr);
	}
		

	}


