package trabajodia15;

public class ConversionDolares {
double cantidad;
    
	public void setCantidad(double cantidad) {
		this.cantidad=cantidad;
	} 
	public double getEquivalenteasol() {
		return cantidad*3.63;
	}
	public double getEquivalenteapeso() {
		return cantidad*17.16;
	}
	public double getEquivalenteaquetzal() {
		return cantidad*7.84;
	}
}
