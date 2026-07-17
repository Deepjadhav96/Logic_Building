
#include<iostream>
using namespace std;

float Maximum(float No1, float No2)
{
    float Ans;
    (No1 > No2) ? Ans =  No1 : Ans =  No2;      //? ternary operator
    
}

int main()
{
 
    cout<<Maximum(11.4f, 45.3f)<<"\n";
    return 0;
}