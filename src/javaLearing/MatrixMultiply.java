package javaLearing;

import java.util.Scanner;

public class MatrixMultiply {

	public static void main(String[] args) {
		int m,n,i,j,k;
		int sum=0;
		String s;
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter the number of rows");
		s=sc.next();
		m= Integer.parseInt(s);
		System.out.println(" Enter the number of columns");
		s= sc.next();
		n= Integer.parseInt(s);
		int matA[][]= new int [m][n];
		int matB[][]= new int [m][n];
		int matC[][]= new int [m][n];
		System.out.println(" Enter the elements of frist matrix");
		for(i=0;i<m;i++){
			for (j=0;j<n;j++){
				s=sc.next();
				matA[i][j]= Integer.parseInt(s);
			}
		}
		System.out.println(" Enter the elements of second matrix");
		for( i=0; i<m;i++){
			for(j=0;j<n;j++){
				s=sc.next();
				matB[i][j]=Integer.parseInt(s);
			}
		}
		System.out.println(" REsult matrix after multiplication");
		for( i=0; i<m;i++){
			for(j=0;j<n;j++){
				sum=0;
				for(k=0;k<n;k++){
					sum= sum+matA[i][k]*matB[k][j];
				
				}
				matC[i][j]= sum;
				System.out.println((matC[i][j])+" ");
			}
			System.out.println();
			
		}
	}

}
