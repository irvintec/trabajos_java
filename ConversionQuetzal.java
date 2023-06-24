package trabajodia15;

public class ConversionQuetzal {
double cantidad;
    
	public void setCantidad(double cantidad) {
		this.cantidad=cantidad;
	} 
	public double getEquivalenteasol() {
		return cantidad*0.46;
	}
	public double getEquivalenteapeso() {
		return cantidad*2.19;
	}
	public double getEquivalenteadolar() {
		return cantidad*0.13;
	}
}
