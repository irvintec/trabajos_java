package añobiciesto;

public class Condicional {
int añooo;

public void Biciesto(int año) {
	this.añooo=año;
}
public void setAño(int año) {
	añooo=año;
}
public int getnombre(int año) {
	return año;
}
public boolean getbiciesto() {
	if (añooo % 4 == 0 || añooo % 400==0) {
            return true;
    }else {
    	return false;}
    }

}
