#include<stdio.h>
int main()
{

    int n;
    printf("Enter the year\n");
    scanf("%d",&n);
    if(n%4==0)
    {
        printf("leap year",n);
    }else
    {

        printf("not leap year",n);
    }
return 0;
}
