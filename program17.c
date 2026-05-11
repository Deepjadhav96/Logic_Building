#include<stdio.h>
#include<stdbool.h> //by using this header file we can use boolean in C programming language

bool  CheckEvenOdd(int iNo)
{   
     if (( iNo % 2) == 0)
     {
      return true;
     }
     else
     {
      return false;
     }
}


int main()
{

    int iValue = 0;
    bool bRet = false;

    printf("Enter number to check whether it is Even or Odd: ");
    scanf("%d",&iValue);

   bRet = CheckEvenOdd(iValue);

   if(bRet)
   {
     printf("%d is Even\n",iValue);
   }
   else
   {
    printf("%d is Odd\n",iValue);
   }


    return 0;
}