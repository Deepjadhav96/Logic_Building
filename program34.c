#include<stdio.h>

void Display(int iNo)
{
    if(iNo < 0)                                                 //Input filter.
    {
        printf("Invalid Input\n");
        return;
    }
    int iCnt = iNo;

    for(iCnt = iNo; iCnt >= 0; iCnt--)
    {
        printf("%d\n",iCnt);    
    }

}
int main()
{
    int iValue = 0;

    printf("Enter the frequency : ");
    scanf("%d",&iValue);

    Display(iValue);
    

   
    return 0;
}