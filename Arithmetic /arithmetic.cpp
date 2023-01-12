#include<iostream>
using namespace std;

double arithmetic(double a, double b, char op){


	switch (op){

		case '+':{
			return (a+b);
		}

		case'-':{
			return (a-b);
		}

		case '/':{
			return(a/b);
		}

		default:{
			cout<<"You did not enter a recognized operation";
			return 0;
		}
	}
}

int main()
{
	char op;
	int a, b;

	cout<<"What operation would you like to perform\n";
	cin>>op;

	cout<<"Enter the first number\n";
	cin>>a;

	cout<<"Enter the second number\n";
	cin>>b;

	cout<<arithmetic(a,b,op);
	return 0;
}

