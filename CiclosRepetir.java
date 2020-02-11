package ciclosRepetir;

import java.util.Scanner;
public class CiclosRepetir
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// inicio declaraciones
      int suma = 0;
      
      Scanner N = new Scanner(System.in);
      
      int Tamanio = 10;
      int[] ArregloNum = new int [Tamanio];
   // fin declaraciones
      
      
      
      do {
    	  
    	  if(Tamanio>10 || Tamanio<0) 
    	  {
    		  System.out.println("Error, numero invalido, ingrese nuevamente");
    	  }
    	  
    	  System.out.println("Ingrese tamaño arreglo:");
          Tamanio = N.nextInt();
    	  
      }while(Tamanio>10 || Tamanio<0);  
      
      
      for (int i=0; i<Tamanio; i++) // creando e ingresando datos al arreglo
      {
        System.out.println("Ingrese un dato para guardar en arreglo");
        ArregloNum[i] = N.nextInt();
      }
      System.out.println("----valores----");
      
      for (int j = 0; j < Tamanio; j++)
      {
    	  System.out.println(ArregloNum[j]);
    	  suma = suma + ArregloNum[j];
      }
      System.out.println("La suma de los valores del  arreglo es "+suma);
      System.out.println("el promedio del arreglo es "+suma/Tamanio);
      N.close();
	}
}