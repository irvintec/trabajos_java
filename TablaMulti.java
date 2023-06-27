package primer_Proyecto;
import java.util.*;
public class TablaMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int numero = 7, cantidad=100, suma=0;
		 
          /*Aqui esta el codigo de la tabla de multipliacion  */
	        System.out.println("Tabla de multiplicar del 7:");
	        for (int i = 1; i <= 10; i++) {
	            int resultado = numero * i;
	            System.out.println(numero + " x " + i + " = " + resultado);
	        }
	        System.out.println("-------------------------------------------------------------");
	        /* Aqui esta el codigo de los numeros pares*/
	        System.out.println("Numeros pares del 1 al 30:");
	        for (int i = 1; i <= 30; i++) {
	            if (i % 2 == 0) {
	                System.out.print(i+",");
	            }
	        }
	        
	        System.out.println("");
	        /* Aqui esta el codigo de los numeros naturales*/
	        for (int i = 1; i <= cantidad; i++) {
	            suma += i;
	        }
	        System.out.println("-----------------------------------------------------------------------------");
	        System.out.println("La suma de los numeros naturales es: " + suma);
	}

}
