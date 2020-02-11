package ciclosRepetir;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		String palabra = "";
		System.out.println("Ingresar palabra ");
		palabra = sc.next();
		do {
		System.out.println("Ingrese un número positivo\n");
		
	    x = sc.nextInt();
		if(x<0) {
			System.out.println("\nTiene que ingresar un número positivo\n");
		}
		}while(x<0);
		if(Integer.toString(x).length()==1) {
			System.out.println("\nEl número "+x+" tiene "+Integer.toString(x).length()+" cifra \n "+palabra.length());
		}else{
			System.out.println("\nEl número "+x+" tiene "+Integer.toString(x).length()+" cifras");
		}
	sc.close();
	}
	

}
