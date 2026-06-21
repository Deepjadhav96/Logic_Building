#include<iostream>
using namespace std;

#pragma pack(1)
class ArrayX
{
    public:
        int *Arr;
        int iSize;

        
        ArrayX(int X)              //Parameterized constructor
        {
            iSize = X;              //Characteristic allocation

            Arr = new int[iSize];   //Resource allocation
        }

        ~ArrayX()                   //Destructor       
        {
            delete []Arr;           //Resource deallocation
        }
};

int main()
{
    //Static memory allocation for object
    ArrayX aobj1(5);                     //Parameterized

   
    return 0;
}