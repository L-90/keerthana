#include<stdio.h>
int main()
{
    int n1,n2,i;
    printf("Enter the min and max values of an interval:");
    scanf("%d%d",&n1,&n2);
    i=n1+1;
    printf("The even numbers between the intervals are:\n");
    while((i>n1)&&(i<n2))
    {
        if(i%2==0)
            printf("%d/n",i);
    i++;
    }
    }

