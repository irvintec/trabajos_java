package trabajodia15;

public class ConversionSol {
     double cantidad;
     
	public void setCantidad(double cantidad) {
		this.cantidad=cantidad;
	} 
	public double getEquivalenteapesos() {
		return cantidad*4.73;
	}
	public double getEquivalenteadolares() {
		return cantidad*0.28;
	}
	public double getEquivalenteaquetzal() {
		return cantidad*2.16;
	}
}
