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
            cout<<"Inside constructor\n";
 
            iSize = X;              //Characteristic allocation

            Arr = new int[iSize];   //Resource allocation
        }

        ~ArrayX()                   //Destructor       
        {
            cout<<"Inside Destructor\n";

            delete []Arr;           //Resource deallocation
        }
};

int main()
{
    //Dynamic memory allocation of object
    
    ArrayX *aobj1 = new ArrayX(5);                //Parameterized

   
    return 0;
}