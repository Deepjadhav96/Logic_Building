#include<stdio.h>

int main()
{
    int iArr[] = {10,20,30,40,50};

    printf("%d \n",iArr);
    printf("%d \n",&iArr);
    printf("%d \n",&iArr[0]);

    return 0;
}