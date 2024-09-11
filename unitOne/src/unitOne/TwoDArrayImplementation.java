package unitOne;

import java.util.Scanner;

public class TwoDArrayImplementation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[][] = new int[10][10];
		int b[][] = new int[10][10];
		int c[][] = new int[10][10];
		int rows, cols, rows1,cols1;
		System.out.println("Enter no of rows for matrix a");
		rows = input.nextInt();
		System.out.println("Enter no of columns for matrix a");
		cols = input.nextInt();
		System.out.println("Enter no of rows for matrix b");
		rows1 = input.nextInt();
		System.out.println("Enter no of columns for matrix b");
		cols1 = input.nextInt();
		
		if(cols == rows1) {
			System.out.println("Enter the elements of First array a:\n");
			for(int i =0;i< rows;i++) {
				for(int j=0;j< cols;j++) {
					System.out.printf("a[%d][%d]:\t",i,j);
					a[i][j] = input.nextInt();
					
				}
			}
			System.out.println("Enter the elements of First array b:\n");
			for(int i =0;i< rows1;i++) {
				for(int j=0;j< cols1;j++) {
					System.out.printf("b[%d][%d]:\t",i,j);
					b[i][j] = input.nextInt();
					
				}
			}
			
			//multiply
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols1; j++) {
					int row_mul_col = 0;
					
					for (int k = 0; k < cols; k++) {
						row_mul_col += a[i][k] * b[k][j];
						
						}
					
					c[i][j] = row_mul_col;
					}
				}
			System.out.println("The resultant matrix is:");
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < cols; j++) {
						System.out.print(c[i][j] + " ");
						}
					
					System.out.println();
					
					}
			
			
		}else {
			System.out.println("Size incompatible for matrix multiplication");
		}
		
		
		
		input.close();
	}

}
