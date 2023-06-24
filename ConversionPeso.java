package trabajodia15;

public class ConversionPeso {
	double cantidad;
    
	public void setCantidad(double cantidad) {
		this.cantidad=cantidad;
	} 
	public double getEquivalenteasol() {
		return cantidad*0.21;
	}
	public double getEquivalenteadolares() {
		return cantidad*0.058;
	}
	public double getEquivalenteaquetzal() {
		return cantidad*0.46;
	}
}
