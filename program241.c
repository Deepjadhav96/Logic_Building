#include<stdio.h>

int main()
{
    char Arr[50] = {'\0'};

    printf("Enter string: \n");

    scanf("%[^'\n']s",Arr);       
  

    printf("Entered string is: %s\n",Arr);

    return 0;
}


/*
%[^'\n']s: Read everything until a newline (Enter) is encountered.

%[...]
This is called a scanset. It tells scanf() which characters to accept.

^
Inside the brackets, ^ means NOT.

\n
Newline character (when you press Enter).
*/