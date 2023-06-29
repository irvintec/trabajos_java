package primer_Proyecto;
import java.util.*;
public class MenuoComida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner sc = new Scanner(System.in);
		    int opcion;
		    System.out.println("=======Menu del dia=======");
		    System.out.println("1.- Tacos");
		    System.out.println("2.- Tortas");
		    System.out.println("3.- Hamburguesas");
		    System.out.println("4.- Pizza");
		    System.out.println("5.- Orden de papas");
		    
		    System.out.println("Ingrese una opcion");
		    opcion = sc.nextInt();
		    
		    switch (opcion) {
			case 1:
				System.out.println("Enseguida le entregamos su orden de tacos");
				break;
			case 2:
				System.out.println("Enseguida le traeremos su torta");
				break;
			case 3:
				System.out.println("Enseguida le traemos su hamburguesa");
				break;
			case 4:
				System.out.println("Enseguida le mandamos su pizza");
				break;
			case 5:
				System.out.println("Ahora le traemos su orden de papas");
				break;
			default:
				System.out.println("Opcion no encontrada en el menu");
				break;
			}
	    }
	}

