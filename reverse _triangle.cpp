//William Mwangi
//t00622533
//-------------
#include<iostream>
using namespace std;

int main()
{
	int highest_number;
	cout<<"Enter an integer value between 0 and 9 for the highest number ";
	//When 2 digit numbers are used the triangle looks different because of the spacing.
	
	cin>>highest_number;
	cout<<"\n\n";

	for(int i=1; i<=highest_number; i++){
		for(int j=highest_number; j>=1; j--){

			if(j<=(highest_number-(i-1))){
				cout<<j<<" ";
			}
			else{
				cout<<"  ";
			}
		}
		cout<<endl;

	}
	return 0;
}
