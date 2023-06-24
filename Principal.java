package trabajodia15;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc=new Scanner(System.in);
		ConversionSol con=new ConversionSol();
		ConversionPeso conv=new ConversionPeso();
		ConversionDolares conve=new ConversionDolares();
		ConversionQuetzal conver=new ConversionQuetzal();
		System.out.println("Ingrese la opcion a elegir");
		System.out.println("1.- Sol a Peso");
		System.out.println("2.- Sol a dolares");
		System.out.println("3.- Sol a quetzales");
		System.out.println("4.- Peso a sol");
		System.out.println("5.- Peso a dolares");
		System.out.println("6.- Peso a quetzales");
		System.out.println("7.- dolares a pesos");
		System.out.println("8.- dolares a sol");
		System.out.println("9.- dolares a quetzal");
		System.out.println("10.- quetzal a pesos");
		System.out.println("11.- quetzal a sol");
		System.out.println("12.- quetzal a dolares");
        int opcion=sc.nextInt();
        
        switch (opcion) {
        case 1:
        	System.out.println("Ingrese la cantidad a convertir");
        	int cantidadsol=sc.nextInt();
        	con.setCantidad(cantidadsol);
        	double pesos=con.getEquivalenteapesos();
            System.out.println("Los soles ingresados son equivalente a: "+pesos+" pesos");
            break;
        case 2:
        	System.out.println("Ingrese la cantidad a convertir");
        	 cantidadsol=sc.nextInt();
        	con.setCantidad(cantidadsol);
        	double dolares=con.getEquivalenteadolares();
            System.out.println("Los soles ingresados son equivalentes a : "+dolares+" dolares");
            break;
        case 3:
        	System.out.println("Ingrese la cantidad a convertir");
       	 cantidadsol=sc.nextInt();
       	con.setCantidad(cantidadsol);
       	 double quetzal=con.getEquivalenteaquetzal();
           System.out.println("Los soles ingresados son equivalente a : "+quetzal+" Quetzales");
            break;
        case 4:
        	System.out.println("Ingrese la cantidad a convertir");
          	  int cantidadpeso=sc.nextInt();
          	conv.setCantidad(cantidadpeso);
          	 double sol=conv.getEquivalenteasol();
              System.out.println("Los pesos ingresados son equivalente a : "+sol+" soles");
            break;
        case 5:
        	System.out.println("Ingrese la cantidad a convertir");
        	   cantidadpeso=sc.nextInt();
        	conv.setCantidad(cantidadpeso);
        	 dolares=conv.getEquivalenteadolares();
            System.out.println("Los pesos ingresados son equivalente a : "+dolares+" dolares");
        	break;
        case 6:
        	System.out.println("Ingrese la cantidad a convertir");
        	  cantidadpeso=sc.nextInt();
        	conv.setCantidad(cantidadpeso);
        	 quetzal=conv.getEquivalenteaquetzal();
            System.out.println("Los pesos ingresados son equivalente a : "+quetzal+" quetzales");
        	break;
        case 7:
        	System.out.println("Ingrese la cantidad a convertir");
      	 int cantidaddolar=sc.nextInt();
      	conve.setCantidad(cantidaddolar);
      	 pesos=conve.getEquivalenteapeso();
          System.out.println("Los dolares ingresados son equivalente a : "+pesos+" pesos");
        	break;
        case 8:
        	System.out.println("Ingrese la cantidad a convertir");
         	  cantidaddolar=sc.nextInt();
         	conve.setCantidad(cantidaddolar);
         	 sol=conve.getEquivalenteasol();
             System.out.println("Los dolares ingresados son equivalente a : "+sol+" soles");
        	break;
        case 9:
        	System.out.println("Ingrese la cantidad a convertir");
            cantidaddolar=sc.nextInt();
         	conve.setCantidad(cantidaddolar);
         	 quetzal=conve.getEquivalenteaquetzal();
             System.out.println("Los dolares ingresados son equivalente a : "+quetzal+" quetzales");
        	break;
        case 10:
        	System.out.println("Ingrese la cantidad a convertir");
           int cantidadquetzal=sc.nextInt();
         	conver.setCantidad(cantidadquetzal);
         	 pesos=conver.getEquivalenteapeso();
             System.out.println("Los quetzales ingresados son equivalente a : "+pesos+" pesos");
        	break;
        case 11:
        	System.out.println("Ingrese la cantidad a convertir");
            cantidadquetzal=sc.nextInt();
          	conver.setCantidad(cantidadquetzal);
          	 sol=conver.getEquivalenteasol();
              System.out.println("Los quetzales ingresados son equivalente a : "+sol+" soles");
        	break;
        case 12:
        	System.out.println("Ingrese la cantidad a convertir");
            cantidadquetzal=sc.nextInt();
          	conver.setCantidad(cantidadquetzal);
          	 dolares=conver.getEquivalenteadolar();
              System.out.println("Los quetzales ingresados son equivalente a : "+dolares+" dolares");
        	break;
    }
		
	}

}
