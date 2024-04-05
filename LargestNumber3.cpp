//Written by SRINADHCH07
// CODE : FINDING LARGEST AMONG 3 NO.



#include<iostream>
using namespace std;

int main()
{
int i,m,a[3];
cout<<"Enter 3 Digits:\n";
for(i=0;i<3;i++)
{
cin>>a[i];

}
m=a[0];
for(i=0;i<3;i++)
{
if(a[i]>m)
m=a[i];
}
cout<<"The largest No.  "<<m;
    return 0;
}

#c++
