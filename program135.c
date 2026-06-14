#include<stdio.h>
#include<stdlib.h>

//Time Complexity: O(N)
int Maximum(int Arr[], int iSize)
{

    int iCnt , iCount = 0;
    int iMax = 0;

    iMax = Arr[0];

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
       if(Arr[iCnt] > iMax)
       {
         iMax = Arr[iCnt];
       }
    }

    return iMax;   
}


int main()
{
    int *Brr = NULL;
    int iLength,iCnt, iRet = 0;
    
    printf("Enter a number of element: \n");
    scanf("%d",&iLength);

    Brr = (int *)malloc(sizeof(int) * iLength); 

    printf("Enter the elements:\n");
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

  
   iRet = Maximum(Brr, iLength);

  printf("Largest element is: %d\n",iRet);

   free(Brr);

    return 0;
}