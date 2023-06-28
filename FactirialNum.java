package primer_Proyecto;
import java.util.*;
public class FactirialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc = new Scanner(System.in);
	     
        int factorial = 1;
        int i = 1;
        
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
   
        do {
            factorial *= i;
            i++;
        } while (i <= numero);

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
	}

