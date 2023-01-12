#include<iostream>
using namespace std;
int main(){

	int h,max,c;

	string b=" ", s="*";

	cout<<"How many stars tall would you like the triangle to be? ";

	cin>>h;

	max=(2*h)-1;//number of stars at the bottom row given by twice the height-1

	c=(int)(((2*h)+1)/2);//center position star at the the base as a function of the height given by cieling of max/2

	cout<<"The hieght of the triangle ="+to_string(h)+"\nthe number of stars in the bottom row ="+to_string(max)+"\n the center of the triangle="+to_string(c);
	
	cout<<"\n";
	for(int i=0;i<h;i++){
		for(int j=0;j<=max;j++){
			if(j<=(c+i) && j>=(c-i)){
				cout<<s;
			}
			else{
				cout<<b;
			}
		}
		cout<<"\n";
	}


}
