#include<stdio.h>
#include<stdlib.h>

int Summation(int Arr[],int iSize)
{
    int iCnt = 0;
    int iSum = 0;
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        iSum = iSum + Arr[iCnt];
    }

    return iSum;
}


int main()
{
    int *Brr = NULL;
    int iLength = 0, iCnt = 0;
    int iRet = 0;

    //Step1: Accept the number of elements.
    printf("Enter number of elements:");
    scanf("%d",&iLength);

    //Step2: Allocate the memory.
    Brr = (int *)malloc(iLength * sizeof(int));

    //Step3: Accpet the value from User.
    printf("Enter number the elements: \n");
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    //Step4:Use the memory(LOGIC).
    iRet =  Summation(Brr,iLength);

    printf("Addition of elements is : %d\n",iRet);
     
    //Step5: Deallocate the memory.

    free(Brr);


    return 0;
}

