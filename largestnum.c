#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,c;
printf("enter a numbers");
scanf("%d",&a);
printf("enter b numbers");
scanf("%d",&b);
printf("enter c numbers");
scanf("%d",&c);
if((a>b)&&(a>c))
{
printf("a is largest");
}
else if(b>c)
{
printf("b is largest");
}
else
{
printf("c is largest");
}
getch();
}
