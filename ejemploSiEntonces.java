package ciclosRepetir;

	import java.util.Scanner;
	public class ejemploSiEntonces
	{
		public static void main(String[] args)
		{
			
			int t = 0;
			
			Scanner N = new Scanner(System.in);
			
			System.out.println("Ingrese Temperatura en Grados C°");
			t = N.nextInt();
			
			switch (t){
			case 1:
				t=1; System.out.println("Patitas heladas");
				
				break;
			case 2:
				t=2; System.out.println("Patitas congeladas");
				
				break;
			
			case 3:
				t=3; System.out.println("Patitas calentitas");
				
				break;
				
			case 4:
				t=4; System.out.println("Patitas humeda");
				
				break;
			default:
				System.out.println("Ya no piensas");
					break;
			}
			N.close();
		}
	}
