package añobiciesto;

public class Numeros {
  double num1,num2,num3;
  double mayor1,mayor2,menor;
  
  public void setnum1(double num1) {
	  this.num1=num1;
  }
  public double getnum1() {
  return num1;
}
 
  public void setnum2(double num2) {
	  this.num2=num2;
  }
  public double getnum2() {
  return num2;
}
  public void setnum3(double num3) {
	  this.num3=num3;
  }
  public double getnum3() {
  return num3;
}
  
  public double getMayor1() {
	  return mayor1 = Math.max(num1, Math.max(num2, num3));
  }
  public double getMenor() {
	  return menor = Math.min(num1, Math.max(num2, num3));
  }
  public double getMayor2() {
	  if (num1 != mayor1) {
          mayor2 = Math.max(mayor2, num1);
      }
      if (num2 != mayor1) {
          mayor2 = Math.max(mayor2, num2);
      }
      if (num3 != mayor1) {
          mayor2 = Math.max(mayor2, num3);
      }
      return mayor2;
  }
}