package primer_Proyecto;
import java.util.*;
public class PromedioNnume {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros para promediar:");
        int cantidad = sc.nextInt();

        promedio pro = new promedio();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ":");
            float numero = sc.nextFloat();
            pro.SumaNumeros(numero);
        }
        float promedio = pro.calcularPromedio();
        System.out.println("El promedio de los numeros ingresados es: " + promedio);

    }
}

 class promedio{
	private int cantidad;
    private float suma;
 
   public void SumaNumeros(float numero) {
        suma=suma+ numero;
        cantidad++;
    }

    public float calcularPromedio() {
        if (cantidad == 0) {
            return 0;
        } else {
            return suma / cantidad;
        }
    
    }
}
