#include<iostream>
using namespace std;

#pragma pack(1)
class ArrayX
{
    private:
        int *Arr;
        int iSize;

    public: 

    //Parameterized constructor with default argument
        ArrayX(int X = 5)              
        {
            cout<<"Inside const"<<endl;
            iSize = X;              

            Arr = new int[iSize];   
        }

        ~ArrayX()                   
        {            cout<<"Inside Dest"<<endl;

            delete []Arr;           
        }
};

int main()
{
    
    ArrayX *aobj1 = new ArrayX();           //Parameterized constructor
    ArrayX *aobj2 = new ArrayX(15);         //Parameterized constructor
    
    // (function call)


    delete aobj1;
    delete aobj2;
   
    return 0;
}