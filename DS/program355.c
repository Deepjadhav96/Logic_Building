#include<stdio.h>

#pragma pack(1)
struct  node
{
    int data;
    struct node *next;
    

};
int main()
{
    struct  node obj1,obj2;

    obj1.data = 11;
    obj1.next = &obj2;

    obj2.data = 21;
    obj2.next = NULL;

    printf("%u\n",&obj1);//Addresses we get by using & are all virtual addresses 
    printf("%u\n",&obj2);//Not any langauge in the world can fetch the actual physical address where data has stored

    printf("%u\n",obj1.next);
    printf("%u\n",obj2.next);

    printf("%u\n",obj1.next->data);
   



    return 0;
}