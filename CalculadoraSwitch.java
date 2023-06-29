package primer_Proyecto;
import java.util.*;
public class CalculadoraSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      int num1,num2, opcion, resultado;
      do {
      System.out.println("=== Opciones ===");
      System.out.println("1. Suma");
      System.out.println("2. Resta");
      System.out.println("3. Multiplicacion");
      System.out.println("4. Division");
      System.out.println("5. Salir");
      System.out.print("Ingrese su eleccion: ");
      opcion = sc.nextInt();
      switch (opcion) {
	case 1: 
		System.out.println("Ingrese el primer a sumar");
		num1=sc.nextInt();
		System.out.println("Ingrese el segundo numero a sumar");
		num2=sc.nextInt();
		resultado=num1+num2;
		System.out.println("El resultado de la suma es: "+resultado);
	break;
	case 2:
		System.out.println("Ingrese el primer a restar");
		num1=sc.nextInt();
		System.out.println("Ingrese el segundo numero a restar");
		num2=sc.nextInt();
		resultado=num1-num2;
		System.out.println("El resultado de la resta es: "+resultado);
		break;
	case 3:
		System.out.println("Ingrese el primer a multiplicar");
		num1=sc.nextInt();
		System.out.println("Ingrese el segundo numero a multiplicar");
		num2=sc.nextInt();
		resultado=num1*num2;
		System.out.println("El resultado de la multipliacion es: "+resultado);
		break;
	case 4:
		System.out.println("Ingrese el primer a dividir");
		num1=sc.nextInt();
		System.out.println("Ingrese el segundo numero a dividir");
		num2=sc.nextInt();
		resultado=num1/num2;
		System.out.println("El resultado de la division es: "+resultado);
		break;
	case 5:
		System.out.println("Gracias por utilizar la calculadora");
		break;
	default:
		System.out.println("Opcion fuera del rango de opciones");
	}
	}while(opcion!=5);
	}
}
