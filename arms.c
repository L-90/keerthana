#include<stdio.h>
int main()
{
    int number,originalNumber,remainder,result=0;
    printf("Enter a three digit number:");
    scanf("%d",&number);
    originalNumber=number;
    while(originalNumber!=0)
    {

        remainder=originalNumber%10;
        result+=remainder*remainder*remainder;
        originalNumber/=10;
    }

     if(result==number)
        printf("%d is a Armstrong .",number);
     else
        printf("%d is not a Armstrong.",number);
     return 0;
}
