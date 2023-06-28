package primer_Proyecto;
import java.util.*;
public class SumDigi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
		 System.out.println("Ingrese un numero para sumar sus digitos");
	     int num=sc.nextInt();
	     int suma=0;
	     
	     while (num != 0) {
	          int digito = num % 10;
	          suma += digito;
	          num /= 10;
	      }

	      System.out.println("La suma de los digitos es: " + suma);
		
		
	}

}
