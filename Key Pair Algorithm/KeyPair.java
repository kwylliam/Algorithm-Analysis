public class KeyPair{
	public static void main(String[] args) {

		int[]s=new int[5]; //create an integer array s with 5 elements

		System.out.print("s=[");

		for(int i=0; i<s.length; i++){
			s[i]=(int) (Math.random()*101);//random integers from 0 to 100;
			System.out.print((i==s.length-1)?s[i]:s[i]+",");
		}

		System.out.print("]");
		System.out.println("\n");

		//Inititialize both large and small as 0
		int small=0;
		int large=0;


		findBoth(s.length, s, small, large);//find the largest and smallest keys

		


	}
	//--------------------------------------------------//
	//FindBoth Method
	//--------------------------------------------------//

	static void findBoth(int n, int[]s, int small, int large){
		int i=0;
		int loopCount=0; //variable for keeping track of iterations, for the purpose of better output steps presentation

		//Part 1
		//-----------------------------------------------------------------
		//Compares the first 2 values in the arrays s (index 0 and index 1) 
		//and initialize small to the samller one and large to the larger one

		System.out.println("Compares the first 2 values and sets small to the smaller one and large to the larger one");

		if(s[0]<s[2]){
			System.out.println(s[0]+"<"+s[1]);
			System.out.println("small="+ s[0]+"\nlarge="+s[1]);
			small=s[0];
			large=s[1];
		}

		else{
			System.out.println(s[1]+"<"+s[0]);
			System.out.println("small="+ s[1]+"\nlarge="+s[0]);
			small=s[1];
			large=s[0];
		}

		System.out.println("\n");

		//--------------------------------------------------------------
		//After part one has run, small and large have been initialized the program now continues 
		//comparing the keys from the third value(s[2])

		//Part 2
		//---------------------------------------------------------------
		//The program cycles through the rest of the values in s comparing them 2 at a time from index 2 to the end

		//*code was modified by changing i=i+2 to ip

		for(i=2;i<(n-1);i++/*modification i=i+2 to i++*/){
		// takes index i and i+1 compares them, and in turn compares them to small and large. 
			loopCount++;
			System.out.println("\n\n Iteration #"+loopCount+"\n");
			System.out.println("Comparing: "+s[i]+ " and "+s[i+1]);
			
			if (s[i]<s[i+1]){
				System.out.println(s[i]+"<"+s[i+1]+"\nprogram will now compare "+s[i]+" with small="+small);
				if(s[i]<small){
					System.out.println(s[i]+"<"+small+ "therefore small is now set to "+ s[i]);
					small=s[i];
				}

				else{
					System.out.println(small+"<"+s[i]+"therefore the value of small remains unchanged");
				}

				System.out.println("Program is now comparing "+s[i+1]+" with large= "+large);
				if(s[i+1]>large){
					System.out.println(s[i+1]+">"+large+" therefore large is now set to "+ s[i+1]);
					large=s[i+1];

				}
				else{
					System.out.println(large+">"+s[i+1]+"therefore the value of large remains unchanged");
				}
			}

			else{
				System.out.println(s[i+1]+"<"+s[i]+"\nprogram will now compare "+s[i+1]+" with small="+small);
				if(s[i+1]<small){
					System.out.println(s[i+1]+"<"+small+ "therefore small is now set to "+ s[i+1]);
					small=s[i+1];
				}

				else{
					System.out.println(small+"<"+s[i+1]+"therefore the value of small remains unchanged");
				}

				System.out.println("Program is now comparing "+s[i]+" with large="+large);
				if(s[i]>large){
					System.out.println(s[i]+">"+large+" therefore large is now set to "+ s[i]);
					large=s[i];

				}
				else{
					System.out.println(large+">"+s[i]+"therefore the value of large remains unchanged");
				}
			}


		}
		
		System.out.println("\n\nsmallest="+small+"\nlargest="+large);
	}
}
