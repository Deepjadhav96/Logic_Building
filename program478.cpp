
#include<iostream>
using namespace std;

template <class T>
T Maximum(T No1, T No2)
{
    T Ans;
    if(No1 > No2)
    {
        Ans=  No1;
    }
    else
    {
        Ans=  No2;
    }
    return Ans;
}

int main()
{
 
    cout<<Maximum(11.4f, 45.3f)<<"\n";

    cout<<Maximum(11, 45)<<"\n";

    cout<<Maximum(11.34, 12.98)<<"\n";    
    
    return 0;
}