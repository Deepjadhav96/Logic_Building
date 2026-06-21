#include<iostream>
using namespace std;

#pragma pack(1)
class ArrayX
{
    public:
        int *Arr;
        int iSize;

        ArrayX(int X)
        {

        }
};


int main()
{
    ArrayX aobj;  //error because we called default constructor instead of parameterized

    cout<<sizeof(aobj)<<"\n";  // 16 bytes due to padding
     
    return 0;
}