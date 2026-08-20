#include<stdio.h>
#include<stdlib.h>

typedef struct node         //Another way of typedef
{
    int data;
    struct node *next;
}NODE,*PNODE,**PPNODE;


int main()
{
    PNODE head = NULL;
    return 0;
}
