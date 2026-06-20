#include<iostream>
using namespace std;

class ArrayX
{
    public:
        int *Arr;
        int iSize;
};


int main()
{
    ArrayX aobj;

    cout<<sizeof(aobj)<<"\n";  // 16 bytes due to padding
     
    return 0;
}