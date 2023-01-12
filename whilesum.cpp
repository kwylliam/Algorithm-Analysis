#include<iostream>
using namespace std;
int main(){

	int x, ans=0, i=0;
	cout<<"Enter an integer";
	cin>>x;

	while(i<=x){
		ans+=i;
		i++;
	}

	cout<<"The sum of the first "+to_string(x)+" natural numbers is "+to_string(ans);

}