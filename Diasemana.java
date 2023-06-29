package primer_Proyecto;
import java.util.*;
public class Diasemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int NumDia=0;
     
     System.out.println("Ingrese un numero: ");
     NumDia = sc.nextInt();
     
     switch (NumDia) {
	case 1:
		System.out.println("Lunes");
		break;
	case 2:
		System.out.println("Martes");
		break;
	case 3:
		System.out.println("Miercoles");
		break;
	case 4:
		System.out.println("Jueves");
		break;
	case 5:
		System.out.println("Viernes");
		break;
	case 6:
		System.out.println("Sabado");
		break;
	case 7:
		System.out.println("Domingo");
		break;
	default:
		System.out.println("No ingreso un numero en el rango de la semana");
		break;
	}
	}

}
