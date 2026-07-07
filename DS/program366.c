#include<stdio.h>

#pragma pack(1)
struct  node
{
    int data;
    struct node *next;
    

};
typedef struct node NODE;
typedef struct node * PNODE;

void Display(PNODE first)
{

   while(first != NULL)
   {
    printf("%d\n",first->data);
    first = first -> next;  
   }

  
}

int main()
{
    PNODE head = NULL;
    int iRet = 0;

    NODE obj1,obj2,obj3;
    head = &obj1;


    obj1.data = 11;
    obj1.next = &obj2;

    obj2.data = 21;
    obj2.next = &obj3;

    obj3.data = 51;
    obj3.next = NULL;

   printf("Elements in linked list are:\n");

   Display(head);
   
   


    return 0;
}