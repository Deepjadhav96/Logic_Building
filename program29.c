#include<stdio.h>

void Display(int iNo)
{
    if(iNo < 0)                                                 //Input updater.
    {
        iNo = -iNo;
    }
    int iCnt = 0;

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("Jay Ganesh...\n");    
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