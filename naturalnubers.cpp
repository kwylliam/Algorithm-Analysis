#include<iostream>
using namespace std;
int main(){
	int x, ans=0;
	cout<<"Enter an integer";
	cin>>x;

	for(int i=0; i<=x; i++){
		ans+=i;
	}

	cout<<"The sum of the first "+to_string(x)+" natural numbers is "+to_string(ans);

}