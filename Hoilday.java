package set3;

import java.util.Scanner;

public class Hoilday {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the day");
		String day=s.next();
		String p=day.toLowerCase();
		if(p.equals("monday")||p.equals("tuesday")||p.equals("wednesday")||p.equals("thursday")||p.equals("friday")||p.equals("saturday")){
			System.out.println("true");
		}
		else if(p.equals("sunday")){
			System.out.println("flase");
		}
		else{
			System.out.println("Invalid");
			s.close();
		}

	}

}
