#include<stdio.h>
int main()
{

    int i,m;
    printf("Enter the number:");
    scanf("%d",&m);
    for(i=1;i<=m;i++)
    {

        if(i%2!=0)
        {

            printf("%d odd number",i);
        }
    }
        return 0;

        }


