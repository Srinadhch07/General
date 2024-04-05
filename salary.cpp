//Written by SRINADHCH07
//code: Net salary by gross salary( DA AND IT)


#include<iostream>
#include<math.h>
using namespace std;
class employee
{
public:
 long long int g;
char n[50];

}s[100];

int main()
{

int i,n;
float ns,da,it;
cout<<"Enter the number of employees\n";
cin>>n;
for(i=0;i<n;i++)
{
cout<<"Enter NAME : ";
cin>>s[i].n;
cout<<"Enter Gross Salary\n";
cin>>s[i].g;
da=(s[i].g/100)*52;
it=(s[i].g/100)*30;
ns=(s[i].g+da)-it;
cout<<"THE NET SALARY : "<<ns;

}

    
    return 0;
}

#c++
