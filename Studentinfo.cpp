//Written by :Srinadhch07
// code: information of three students 


#include<iostream>
using namespace std;

struct sri {

public:
char name[50];
int roll;
char grade;


}s[3];

int main()
{
int i;
    
   cout<<"Enter The information:\n";
 for ( i=0;i<3;i++)
{

cout<<"Roll number\n";
cin>>s[i].roll;
cout<<"\nEnter name\n ";

cin>>s[i].name;
cout<<"\nEnter grade\n";
cin>>s[i].grade;
}
cout<<"\nDisplay information\n";
for(i=0;i<3;i++)
{

cout<<"\nNAME :";
cout<<s[i].name;
cout<<"\nROLL NO:";
cout<<s[i].roll;
cout<<"\nGRADE:";
cout<<s[i].grade;
}
    return 0;
}


#c++
