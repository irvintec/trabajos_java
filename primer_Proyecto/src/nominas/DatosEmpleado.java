package nominas;

public class DatosEmpleado {
String nombre;
String puesto;
double horastrab;
double horasext;
  
 public void datos(String nombre, String puesto, double horastrab, double horasext) {
	 this.nombre=nombre;
	 this.puesto=puesto;
	 this.horastrab=horastrab;
	 this.horasext=horasext;
 }
 public void setNombre(String nombre) {
	 this.nombre=nombre;
 }
 public String getNombre() {
	 return nombre;
 }
 public void setPuesto(String puesto) {
	 this.puesto=puesto;
 }
 public String getPuesto() {
	 return puesto;
 }
 public void setHorasTrab(double horastrab) {
	 this.horastrab=horastrab;
 }
public double getSueldo() {
	double sueldo=horastrab*72.87;	
	return sueldo;
}
public void setHorasExt(double horasext) {
	this.horasext=horasext;
}
public double getExt() {
	double ext=horasext*25.96;
	return ext;

}

}

