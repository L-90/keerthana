#include<stdio.h>
#include<conio.h>
#include<ctype.h>
int main()
{
char check;
scanf("%c",&check);
if(isdigit(check))
{
printf("\nnumber");
}
  else
	{
  	printf("\ncharacter");
	}
return 0;
}
