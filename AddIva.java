package trabajodia15;

public class AddIva {
double precio, iva;
 
public void setPrecio(double precio) {
	this.precio=precio;
}
public double getPrecio() {
	return precio;
}
public double getIvasuperior() {
	iva=precio*0.10;
	return precio-iva;
}
public double getIvainferior() {
	iva=precio*0.05;
	return precio-iva;
}
}
