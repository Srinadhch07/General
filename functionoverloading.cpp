// Function overloading
//written by : SRINADHCH07

#include<iostream>
using namespace std;
int sum(int a,int b, int c){
return a+b+c;
}
int sum (int a){
return a ;
}
int main()
{
cout<<sum(1,2,3)<<endl;
cout<<sum(1);
}
