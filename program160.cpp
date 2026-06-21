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
    
    ArrayX *aobj1 = new ArrayX(5);                //Parameterized

    delete aobj1;

    cout<<"End of main\n";

   
    return 0;
}