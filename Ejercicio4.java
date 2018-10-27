
import java.util.Scanner;
public class Ejercicio4{

	public static void  main (String args[]){
		int numero, i=1;
		String digitos;


		Scanner S = new Scanner(System.in);
		System.out.println("Ingresa un entero");
		numero = S.nextInt();
		digitos = Integer.toString(numero);
		System.out.println("Tiene " + digitos.length());

		//System.out.println("Tiene " + Integer.toString(S.nextInt()).length());
		
	/*while (i!=0){

		if (numero<10){
			System.out.println("Tiene " + i);
			i = 0;


		}else{
			numero = numero/ 10;
			i++;
		}
	}
	*/
		/*for (double i = 1; i >= 1;i++){
			
			if (numero<10){
				System.out.println("Tiene " + i);
				i=-1;
			}else{
				numero = numero / 10;
			}
		}*/
		

	}
}


