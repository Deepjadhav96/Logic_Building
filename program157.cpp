#include<iostream>
using namespace std;

#pragma pack(1)
class ArrayX
{
    public:
        int *Arr;
        int iSize;

        ArrayX()         //Default constructor
        {

        }
        ArrayX(int X)    //Parameterized constructor
        {

        }
};

int main()
{
    ArrayX aobj;            //Default
    ArrayX aobj2(5);        //Parameterized

    cout<<sizeof(aobj)<<"\n";  // 12 bytes due to padding
     
    return 0;
}