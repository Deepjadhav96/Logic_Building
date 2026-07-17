//Generic programming
#include<iostream>
using namespace std;

int Maximum(int No1, int No2)
{
    if(No1 > No2)
    {
        return No1;
    }
    else
    {
        return No2;
    }
}

int main()
{
 int Value1  = 10, Value2 = 11, Ret = 0;
 Ret = Maximum(Value1, Value2);
 cout<<"Maximum is: "<<Ret<<"\n";

    return 0;
}