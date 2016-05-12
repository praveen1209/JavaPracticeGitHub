package javaLearing;

public class Arrays {
	public static void main(String args[])
	{ 
		int threeD[][][] = new int[3][4][5]; 
	int i, j, k;
	for(i=0; i<3; i++) 
		for(j=0; j<4; j++) 
			for(k=0; k<5; k++)
				threeD[i][j][k] = i * j * k;
	for(i=0; i<3; i++)
	{ 
		for(j=0; j<4; j++) 
	{ 
			
		for(k=0; k<5; k++) 
		
			System.out.print(threeD[i][j][k] + " ");
	System.out.println(); 
	}
		System.out.println();
		}
	}
	} 

	/*public static void main(String[] args) {
		int i[]=new int[5];
		for(int j = 0;j<5;j++){
			i[j]=j+1;
			System.out.println(" print array"+i);
		}
	}*/


