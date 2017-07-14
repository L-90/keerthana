package gvi;

import java.util.Scanner;

public class Square {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int a[][]=new int[4][2];
	int p=0;
	for(int i=0;i<4;i++)
	{System.out.println("enter the first node");
	for(int j=0;j<2;j++)
	 {
	  a[i][j]=s.nextInt();
	 }
	}
	int d=Math.abs(a[0][0]-a[0][1]);
	if(d==Math.abs(a[1][0]-a[1][1])&&d==Math.abs(a[2][0]-a[2][1])&&d==Math.abs(a[3][0]-a[3][1]))
	{
	for(int i=0;i<4;i++)
	{int j=1;
	  if(i==3)
	   {
	   if(a[0][0]!=a[i][j])
	   {p=1;
	   break;}
	   }
	   else{
	   if(a[i][j]!=a[i+1][j-1])
	   {p=1;
	   break;}}
	}
	}
	else
	p=1;
	if(p==1)
	{
	System.out.println("not square");
	}
	else
	System.out.println("square");
	}
	}


