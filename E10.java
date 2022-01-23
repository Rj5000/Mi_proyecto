package Ejercicios_Tema3;

import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {
		int afilas,acolumnas,bfilas,bcolumnas,val;
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Matriz A ");
		System.out.print("Numero de filas: ");
		afilas = sc.nextInt();
		System.out.println();
		System.out.print("Numero de columnas: ");
		acolumnas=sc.nextInt();
		System.out.println();
		int [][] a = new int [afilas][acolumnas];

		System.out.println("Matriz B ");
		System.out.print("Numero de filas: ");
		bfilas = sc.nextInt();
		System.out.println();
		System.out.print("Numero de columnas: ");
		bcolumnas=sc.nextInt();
		System.out.println();
		int [][] b = new int [bfilas][bcolumnas];

		if (bfilas!=acolumnas) {
			System.out.println("No se puede realizar la operación ");
		}else {
			int [][] c = new int [afilas][bcolumnas];
			//Valores de A
			for (int fila=0;fila<afilas;fila++) {
				System.out.println("Introduce la fila "+fila);
				for (int i=0;i<acolumnas;i++) {
					System.out.print("Valor de la matriz A ["+fila+"]["+i+"] ");
					val=sc.nextInt();
					a [fila][i]=val;
					System.out.println();
				}
			}
			//Valores de B
			for (int fila=0;fila<bfilas;fila++) {
				System.out.println("Introduce la fila "+fila);
				for (int i=0;i<bcolumnas;i++) {
					System.out.print("Valor de la matriz B ["+fila+"]["+i+"] : ");
					val=sc.nextInt();
					b [fila][i]=val;
					System.out.println();
				}
			}
			sc.close();
			
			//Valores de C

			for (int i=0;i<afilas;i++) {
				for (int x=0;x<bcolumnas;x++) {
					for (int y=0;y<acolumnas;y++) {
						c[i][x]+= a[i][y]*b[y][x];
					}

				}
			}
			//Mostrar C
			System.out.println("*** Matriz C ***");
			for (int i=0;i<afilas;i++) {
				for (int x=0;x<bcolumnas;x++) {
					System.out.print("\t \t"+c[i][x]);
				}
				System.out.println();
				System.out.println("\t --------------------------------------------");
			}

		}
		}catch(NumberFormatException e) { 
			System.out.println("Error en los datos");
		}finally {}
		}

}




