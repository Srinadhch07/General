//code:exception handling example 
#include<iostream>
using namespace std;
int main()
{
     int n1,n2;
    try{
     cout<<"ENter values :";
     cin>>n1>>n2;
     if(n2==0)
         throw n2;
         else
        cout<<"Division :"<<n1/n2;
}    catch(int i)
        {
            cout<<"ZERO DIVISION ERROR";
        }
}

#cpp
