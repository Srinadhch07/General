//written by : SRINADHCH07
//code : pure virtual fun and parameterized constructors 


#include<iostream>
using namespace std;
class A
{
    public:
    virtual void fun()=0;
    int x;
    A( int i)
    {
        x=i;
    }
};
class B:public A
{
    public :
    int y;
     B(int i, int j ):A(i)
     {
        y=i;
     }
     void fun()
     {
         cout<<" X  " <<x<<"   Y  "<<y;
         }
    };
    int main()
    {
    B   o(12,15);
    o.fun();
    }
    #CPP
