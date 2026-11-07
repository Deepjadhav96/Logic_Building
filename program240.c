#include<stdio.h>
#include<string.h>

int main()
{
    char Arr[50] = {'\0'};

    printf("Enter string: \n");
    scanf("%s",Arr);                //ISSUE

    printf("Entered string is: %s\n",Arr);

    return 0;
}

/*

Enter string: 
Marvellous Infosystems 
Entered string is: Marvellous

 scanf("%s",Arr);      
Reads characters until it encounters a whitespace (space, tab, or Enter).
It cannot read spaces inside the input.
*/