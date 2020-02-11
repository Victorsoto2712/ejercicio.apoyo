package ciclosRepetir;
import java.util.Scanner;
public class ejercicioVtas {


		public static void main(String[] args) {
			
			try (Scanner sc = new Scanner(System.in)) {
		          //           ~~Ejercicio 1~~
					int x, y, i, suma=0;
					//dando valores enteros a las distintas variables
					System.out.println("Ingrese el numero de ventas realizar");
					
					x = sc.nextInt();
					//la x representa el numero de ventas que se ingresara
					for(i=0; i<x; i++) {
					// la i el numeros de ventas realizadas, la cual debe ser menor al numero de ventas
						System.out.println("Ingrese valor de venta");
						
						y = sc.nextInt();
						
						suma=suma+y;
					}
					System.out.println("Valor total de ventas: "+suma);
				}
				System.out.println("\n***********\nEl programa se cerrará\n***********");
			
		}
		
}



