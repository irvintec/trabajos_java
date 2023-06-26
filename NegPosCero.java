package añobiciesto;

public class NegPosCero {

	double Numero;
	
	 public void setnumero(double Numero) {
		  this.Numero=Numero;
	  }
	  public double getnumero() {
	  return Numero;
	}
	  public void Desicion() {
		  if (Numero > 0) {
	           System.out.println("El numero es positivo.");
	        } else if (Numero < 0) {
	            System.out.println("El numero es negativo.");
	        } else {
	            System.out.println("El numero es cero.");
	        }
	  }
	  
	  public void NumPrimo() {
	 
	  if (Numero%Numero==0 && Numero/1==Numero&& Numero%2!=0) {
		  System.out.println("El numero es primo");
	  }else {
		  System.out.println("El numero no es primo");
	  }
	  }
}
