
#include<iostream>
using namespace std;

template <class X>
X Maximum(X No1, X No2 , X No3)
{
    X Ans;
    if(No1 > No2 && No1 > No3)
    {
       return No1;
    }
    else if (No2 > No1 && No3> No2)
    {
       return No2;
    }
    else
    {
        return No3;
    }
   
}

int main()
{
 
    cout<<Maximum(11.4f, 45.3f, 34.5f)<<"\n";

    cout<<Maximum(11, 45, 34)<<"\n";

    cout<<Maximum(11.34, 12.98, 34.8)<<"\n";    
    
    return 0;
}