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
    while (first != 0)                      //type1
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

    if( NULL == *first) //LL is empty
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
    PNODE temp = NULL;
    newn = (PNODE)malloc(sizeof(NODE));

    newn -> data = iNo;
    newn -> next = NULL;

    if(NULL==*first) //LL is empty
    {
        *first = newn;

    }
    else                //LL contains atleast one node
    {
        temp = *first;
        while(temp -> next != NULL)                             //type2
        {
            temp = temp -> next;
        }
        temp -> next = newn;
    }

}
void InsertAtPos(PPNODE first, int iNo, int iPos)
{
    int iCount = 0;
    
    iCount = Count(*first);

    int i = 0;
    PNODE newn = NULL;
    PNODE temp = NULL;

    if((iPos < 1) || (iPos > iCount+1))
    {
        printf("Invalid position");
        return;
    }
    if (iPos == 1)
    {
        InsertFirst(first , iNo);
    }
    else if (iPos == iCount +1)
    {
        InsertLast(first, iNo);
    }
    else
    {
        newn = (PNODE)malloc(sizeof(NODE));

        newn -> data = iNo;
        newn -> next = NULL;

        temp = *first;

        for(i = 1; i < iPos -1; i++)
        {
            temp = temp -> next;
        }
        newn ->next = temp->next;
        temp ->next = newn;
    }
    
    
}

///////////////
void DeleteFirst(PPNODE first)
{
    PNODE temp = NULL;


    if(*first == NULL)      //LL is empty
    {
        return;
    }
    else if((*first) ->next == NULL)  //LL contains one node
    {
        free(*first);
        *first = NULL;

    }
    else                //LL contains more than one node
    {
        temp = *first;

        *first = (*first) -> next;

        free(temp);

    }

}
void DeleteLast(PPNODE first)
{
    PNODE temp = NULL;
     if(*first == NULL)      //LL is empty
    {
        return;
    }
    else if((*first) ->next == NULL)  //LL contains one node
    {
        free(*first);
        *first = NULL;

    }
    else                //LL contains more than one node
    {
        temp = *first;                                           //Type 3
        while (temp -> next -> next != NULL)
        {
            temp = temp -> next;
        }
        
        free(temp->next);
        temp->next = NULL;

    }

}
void DeleteAtPos(PPNODE first, int iPos)
{
    int iCount = 0;
    int i = 0;
    
    PNODE temp = NULL;
    PNODE target = NULL;
    
    iCount = Count(*first);

    if((iPos < 1) || (iPos > iCount))
    {
        printf("Invalid position");
        return;
    }
    if (iPos == 1)
    {
        DeleteFirst(first);
    }
    else if (iPos == iCount )
    {
        DeleteLast(first);
    }
    else
    {
        temp = *first;

        for(i = 1; i < iPos-1; i++)
        {
            temp = temp -> next;
        }
        target = temp -> next;

        temp -> next = target -> next;
        free(target);
        
        
    }

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

    InsertLast(&head , 111);
    InsertLast(&head , 121);

    Display(head);
    iRet = Count(head);
    printf("Number of nodes are : %d\n",iRet);

    DeleteFirst(&head);
    Display(head);
    iRet = Count(head);
    printf("Number of nodes are : %d\n",iRet);

    DeleteLast(&head);
    Display(head);    
    iRet = Count(head);
    printf("Number of nodes are : %d\n",iRet);

    InsertAtPos(&head, 105, 4);
    Display(head);    
    iRet = Count(head);
    printf("Number of nodes are : %d\n",iRet);

    DeleteAtPos(&head, 4);
    Display(head);    
    iRet = Count(head);
    printf("Number of nodes are : %d\n",iRet);

    return 0;
}