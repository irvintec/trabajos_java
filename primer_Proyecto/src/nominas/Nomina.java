package nominas;
import java.util.*;
public class Nomina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String NombEm=sc.nextLine();
        System.out.println("Ingrese su puesto");
        String PuesEmpl=sc.nextLine();
        System.out.println("Ingrese las hora de trabajo");
        double hrstra=sc.nextDouble();
        System.out.println("Ingrese las horas extras de trabajo");
        double hrsext=sc.nextDouble();
        
        
        DatosEmpleado datosem= new DatosEmpleado();
        
        datosem.setNombre(NombEm);
        datosem.setPuesto(PuesEmpl);
        datosem.setHorasTrab(hrstra);
        datosem.setHorasExt(hrsext);
       double sueldobru= datosem.getSueldo()+datosem.getExt();
        System.out.println("Nombre: "+datosem.getNombre());
        System.out.println("Puesto: "+datosem.getPuesto());
        System.out.println("Sueldo bruto: "+sueldobru);
        
        if(sueldobru<2000) {
        	double sueldoneto=sueldobru*0.16;
        	System.out.println(sueldoneto);
        }
        else {
        	double sueldoneto=sueldobru*0.18;
        	System.out.println(sueldoneto);
        }
	}

}
