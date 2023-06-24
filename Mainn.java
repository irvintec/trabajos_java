package trabajodia15;
import java.util.*;
public class Mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
     
      System.out.println("Ingrese el precio del producto");
      double preciopro=sc.nextDouble();
      AddIva add=new AddIva();
      add.setPrecio(preciopro);
      
      if(add.getPrecio()>50) {
    	  System.out.println("Al precio del producto se le desconto el 10%, el precio a pagar es: "+add.getIvasuperior());
      }else {
    	  System.out.println("Al precio del producto se le desconto el 5% el precio a pagar es: "+add.getIvainferior());
      }
	}

}
