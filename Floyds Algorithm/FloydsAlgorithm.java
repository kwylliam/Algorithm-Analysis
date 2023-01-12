import java.util.*;
import java.io.FileReader;
import java.io.IOException;
public class FloydsAlgorithm{

	public static void main(String[] args)throws IOException {

		Double[][] d=new Double[7][7];
		Double[][] p=new Double[7][7];
		for(int i=0; i<7; i++){
			d[i][i]=0.0;
		}

		for(int i=0; i<7; i++){
			for(int j=0; j<7; j++){
				p[i][j]=0.0;
			}
		}


		FileReader f=new FileReader("edges.txt");

		Scanner sc=new Scanner(f);
		sc.useDelimiter(",|\n");

		while(sc.hasNextLine()){

			int a=sc.nextInt();
			int b=sc.nextInt();
			double c=sc.nextInt();

			d[a-1][b-1]=c;

			sc.nextLine();

		}

		floyd(d,p);

		System.out.println("D is displayed below\n\n");
		//display(d);

		//display(p);
		
		int [][] result=new int[7][7];
		int [][] indexes=new int[7][7];
		
		for(int i=0; i<7; i++){
			for(int j=0; j<7; j++){
				result[i][j]=(int)((double)d[i][j]);
				indexes[i][j]=(int)((double)p[i][j]);
				System.out.print((result[i][j]>10)?result[i][j]+" ":" "+result[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("\n\nP is displayed below\n\n");

		display(indexes);
		
	}

	public static void floyd(Double[][] d, Double[][]p){

		Double q= Double.POSITIVE_INFINITY;
		for(int k=0; k<7; k++){
			for( int i=0;i<7;i++){
				for(int j=0; j<7; j++){
					
					Double a, b, c;
					if(d[i][j]==null){
						c=q;
					}
					else
						c=(double)d[i][j];

					if (d[i][k]==null || d[k][j]== null){
						a=q;
						b=q;
					}

					else{
						a= (double)d[i][k];
						b=(double)d[k][j];
					}

					if((a+b)<c){

						p[i][j]=(double)k;

						d[i][j]=a+b;

					}
				}
			}
		}

	}

	public static void display(int[][] d){
		for(int i=0; i<d.length; i++){
			System.out.println();
			for(int j=0; j<d.length; j++){
				System.out.print(d[i][j]+ " ");
			}
		}
	}
}
