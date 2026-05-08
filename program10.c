/////////////////////////////////////////////////////////////////////////////////
//
// Include required header files
//
/////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

/////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : AddTwoNumbers
//  Input :         float, float
//  Output :        float
//  Description:    Performs addition of 2 floats
//  Date :          08/05/2026
//  Author:         Deep Manohar Jadhav
//
/////////////////////////////////////////////////////////////////////////////////

float AddTwoNumbers(
                         float fNo1,    //First input
                         float fNo2     //Second input
                   )
{
    float fAns = 0.0f;                  //Variable to store result
    
    fAns = fNo1 + fNo2;                 //Perform addition

    return fAns;                       
}

/////////////////////////////////////////////////////////////////////////////////
// 
// Application to perform Addition of 2 float values
// 
//
/////////////////////////////////////////////////////////////////////////////////

int main()
{    

    float fValue1 = 0.0f;                   // To store first input
    float fValue2 = 0.0f;                   // To store second input
    float fResult = 0.0f;                   // To store the result

    printf("Enter first number : \n");      
    scanf("%f",&fValue1);

    printf("Enter first number : \n");
    scanf("%f",&fValue2);

    fResult = AddTwoNumbers( fValue1 , fValue2);            // Function call.

    printf("Addition is : %f\n",fResult);

    return 0;
}

/////////////////////////////////////////////////////////////////////////////////
//
//  Input : 10.0  11.0
//  Output: 21.0
//
/////////////////////////////////////////////////////////////////////////////////