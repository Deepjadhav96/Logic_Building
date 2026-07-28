
#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

#pragma pack(1)

struct node
{
    int data;
    struct node *lchild;
    struct node *rchild;
};

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

//Left   Data   Right
void Inorder(PNODE first)
{
    if(first != NULL)
    {
        Inorder(first->lchild);
        printf("%d\n",first->data);
        Inorder(first->rchild);
    }
}
//Data   Left   Right
void Preorder(PNODE first)
{
    if(first != NULL)
    {
        printf("%d\n",first->data);
        Preorder(first->lchild);
        Preorder(first->rchild);
    }
}

//Left   Right  Data
void Postorder(PNODE first)
{
    if(first != NULL)
    {
        
        Postorder(first->lchild);
        Postorder(first->rchild);
        printf("%d\n",first->data);
    }
}
void Insert(PPNODE first, int iNo)
{
    PNODE temp = NULL;
    PNODE newn = NULL;
    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->lchild = NULL;
    newn->rchild = NULL;

    if(*first == NULL)
    {
        *first = newn; 
    }
    else
    {
        temp = *first;

        while (1)
        {
            if(iNo > temp->data)
            {
                if(temp->rchild == NULL)
                {
                    temp->rchild = newn;
                    break;
                }
                temp = temp->rchild;
                
            }
            else if (iNo < temp->data)
            {
                if(temp->lchild == NULL)
                {
                    temp->lchild = newn;
                    break;
                }
                temp = temp->lchild;
            }
            else if (iNo == temp->data)
            {
                printf("Enable to insert as element is Dubilcate\n");
                free(newn);
                break;
            }
        
        }
        

    }
}

int Count(PNODE first)
{
    static int iCount = 0;

    if(first != NULL)
    {
       iCount ++;
       Count(first->lchild);
       Count(first->rchild);
    }
    return iCount;
}


int main()
{
    PNODE head = NULL;
    int iRet = 0;

    Insert(&head,11);
    Insert(&head,5);
    Insert(&head,17);
    Insert(&head,21);
    Insert(&head,4);
    Insert(&head,7);
    Insert(&head,15);

    printf("Inorder Display : \n");
    Inorder(head);

    iRet = Count(head);
    printf("Number of Nodes Are : %d\n",iRet);

    return 0;
}