package añobiciesto;
import java.util.*;
public class PrincipalNum {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero");
		double numero1=sc.nextDouble();
		System.out.println("Ingresa el segundo numero");
		double numero2=sc.nextDouble();
		System.out.println("Ingrese el tercer numero");
		double numero3=sc.nextDouble();
		
		Numeros Ins=new Numeros();
		Ins.setnum1(numero1);
		Ins.setnum2(numero2);
		Ins.setnum3(numero3);
		System.out.println("Los numeros mayores son : "+Ins.getMayor1()+" y "+Ins.getMayor2());
		double residuo=Ins.getMayor1()%Ins.mayor2;
		double resultado=Ins.getMayor1()/Ins.mayor2;
		double nummenor=Ins.getMenor();
		double suma=residuo+nummenor;
		
		if(Ins.getMayor1()%Ins.mayor2==0) {
			
			System.out.println("El residuo de dividir: "+Ins.getMayor1()+" entre "+Ins.getMayor2()+" es: " +residuo);
		}else {
			
			System.out.println("El resultado de dividir: "+Ins.getMayor1()+" entre "+Ins.getMayor2()+" es: " +resultado);
		}
	System.out.println("La suma del residuo "+ residuo+" + la suma del numero menor "+nummenor+" es: "+suma);
	}
}
