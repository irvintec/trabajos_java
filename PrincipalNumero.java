package añobiciesto;
import java.util.*;
public class PrincipalNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Ingrese el numero a verificar");
	   double num=sc.nextDouble();
	   
	   NegPosCero des=new NegPosCero();
	   des.setnumero(num);
	   des.Desicion();
	   des.NumPrimo();
	}

}
