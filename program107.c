#include<stdio.h>

void Display(int iPtr[])   
{
    printf("%d\n",*iPtr);

    iPtr++;

    printf("%d\n",*iPtr);
    
    iPtr++;

    printf("%d\n",*iPtr);

    printf("/n"); //Added 

}

int main()
{
    int Arr[5] ={10,20,30,40,50};
    
    Display(Arr);
    
    return 0;
}