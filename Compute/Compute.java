public class Compute{
	public static void main(String[] args) {

		int[] b={1,0,0,1,0,0,1,0,1};

		int a=compute(943,741,293,741,b);

		System.out.println("\n\na="+a);


	}

	public static int compute(int n,int m,int k, int a, int[] b){
		a=1;
		for(int i=b.length-1; i>=0; i--){
			System.out.println("\n\nFor i= "+i+" and b[i]=" + b[i]);
			a=(a*a)%n;
			System.out.println("a="+a);

			if (b[i]==1){
				System.out.println("a= ("+a+ "*"+ m+")="+ (a*m)%n);
				a=(a*m)%n;
			}
		}
		return a;
		}
		 
}


		

