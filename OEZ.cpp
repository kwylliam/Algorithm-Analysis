#include<iostream>
//using namespace std;

int main()
{
	int x;
	std::cout<<"Enter an integer ";
	std::cin>>x;

	if (x==0)
	{
		std::cout<<"x is 0";
	}

	else if ((x%2)==0){
		std::cout<<"x is even";
	}

	else{
		std::cout<<"x is odd";
	}


	return 0;
}
