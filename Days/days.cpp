#include<iostream>
using namespace std;

int main(){

	int x;

	cout<<"Enter an integer between 1 and 7";
	cin>>x;

	switch(x){
		case 1:{
			cout<< "the day is Sunday";
			break;
		}

		case 2: {
			cout<< "The day is Monday";
			break;
		}

		case 3: {
			cout<<"The day is Tuesday";
			break;
		}

		case 4: {
			cout<<"The day is Wednesday";
			break;
		}

		case 5:{
			cout<<"The day is Thursday";
			break;
		}

		case 6: {
			cout<<"The day is Friday";
			break;
		}

		case 7:{
			cout<<"The day is Saturday";
			break;
		}
		default:{
			cout<<"The integer was not between 1 and 7";
			break;
		}
	}
}