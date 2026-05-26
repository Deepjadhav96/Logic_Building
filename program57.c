//Input  : 5
//Output :  1  3  5 

#include<stdio.h>

void Display(int iN0)
{
    int iCnt = 0;

    for(iCnt = 1; iCnt <= iN0 ; iCnt += 2)   // += its shorthand operator
                                            // iCnt = iCnt + 2
    {
        printf("%d \t",iCnt);
    }

    printf("\n");
}
int main()
{
    int iValue = 0;

    printf("Enter a number: \n");
    scanf("%d",&iValue);

    Display(iValue);
    return 0;

}