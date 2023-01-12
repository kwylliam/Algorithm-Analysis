//Euclid's algorithm
public class Euclid{
	public static void main(String[] args) {
		int ans=gcd(31415,14142);
		
		gcd(60,24);
		
		System.out.println(ans);

	}

public static int gcd(int m, int n){
	System.out.println("Now Calculating gdd("+m+","+n+")");
	if(n==0) return m;

	while(n!=0){
		int r=m%n;

		m=n;

		n=r;

		gcd(m, n);
	}
	
	return m;
}


}
