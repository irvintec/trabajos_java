package primer_Proyecto;
import java.util.Scanner;
public class Cociente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Ingresa el primer numero");
        int dividendo = sc.nextInt();
        System.out.println("Ingresa el segundo numero");
        int divisor = sc.nextInt();
        Division division = rdivision(dividendo, divisor);
        System.out.println("El cociente es: " + division.getCociente());
        System.out.println("El resto de la operacion es : " + division.getResto());
        System.out.println("El resultado real es: " + division.getRespuesta());
	


	}
public static Division rdivision(int dividendo, int divisor) {
    //Calcular cociente
    int cociente = dividendo / divisor;

    //Calcurar resto
    int resto = dividendo % divisor;

    //Calcular la división
    double respurtaDiv = (double) dividendo / divisor;

    //Calcular instansia
    return new Division(cociente, resto, respurtaDiv);
}

}

class Division{
    private int cociente;
    private int resto;
    private double respurtaDiv;

    public Division(int cociente, int resto, double respurtaDiv) {
        this.cociente = cociente;
        this.resto = resto;
        this.respurtaDiv = respurtaDiv;
    }

    public int getCociente() {
        return cociente;
    }

    public int getResto() {
        return resto;
    }

    public double getRespuesta() {
        return respurtaDiv;
    }

}
