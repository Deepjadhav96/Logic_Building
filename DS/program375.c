#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

void Display(PNODE first)
{
    while(first)//same as (first != 0)
    {
        printf("| %d | ->",first->data);//Beautification of display function
        first = first->next;
    }
    printf("NULL\n");
    
}
int Count(PNODE first)
{
    int iCount = 0;
    while (first)//same as (first != 0)  [Avoid this]
    {
        iCount++;
        first = first -> next;
    }
    
    return iCount;

}

//////////////

void InsertFirst(PPNODE first, int iNo)
{
    PNODE newn = NULL;
    newn = (PNODE)malloc(sizeof(NODE));

    newn -> data = iNo;
    newn -> next = NULL;

    if(*first == NULL) //LL is empty
    {
        *first = newn;


    }
    else                //LL contains atleast one node
    {
        newn -> next = *first;
        *first = newn;
    }

}
void InsertLast(PPNODE first, int iNo)
{
    PNODE newn = NULL;
    newn = (PNODE)malloc(sizeof(NODE));

    newn -> data = iNo;
    newn -> next = NULL;

    if(*first == NULL) //LL is empty
    {
        *first = newn;

    }
    else                //LL contains atleast one node
    {

    }

}
void InsertAtPos(PPNODE first, int iNo, int iPos)
{

}

///////////////
void DeleteFirst(PNODE first)
{

}
void DeleteLast(PNODE first)
{

}
void DeleteAtPos(PNODE first, int iPos)
{

}
/////////////////

int main()
{
    PNODE head = NULL;
    
    InsertFirst(&head,101);
    InsertFirst(&head,51);
    InsertFirst(&head,21);
    InsertFirst(&head,11);

    Display(head);

    int iRet = 0;
    iRet = Count(head);
    printf("Number of nodes are : %d\n",iRet);

    return 0;
}