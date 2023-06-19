package primer_Proyecto;

import java.util.Scanner;

public class primeraPrueba {
 public static void main(String[] arg) {
	
	 //System.out.println("Hola mundo");
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("ingrese el primer numero");
	 float numero1=sc.nextFloat();
	 System.out.println("ingrese el segundo numero");
	 float numero2=sc.nextFloat();
	 float suma=numero1+numero2;
	 System.out.println("El resultado es de la suma es:"+suma);
	 float resta=numero1-numero2;
	 System.out.println("El resultado es de la resta es:"+resta);
	 float division=numero1/numero2;
	 System.out.println("El resultado es de la division es:"+division);
	 float multiplicacion=numero1*numero2;
	 System.out.println("El resultado es de la multipliacion es:"+multiplicacion);

	 
	 
	 
 }
}
