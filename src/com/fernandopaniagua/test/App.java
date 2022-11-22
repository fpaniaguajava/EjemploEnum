package com.fernandopaniagua.test;

//
//import static com.fernandopaniagua.test.Estado.*;
//Con el import anterior se puede referenciar a los valores de la 
//enumeración sin indicar la clase a la que pertenecen


public class App {
	public static void main(String[] args) {
		
		Factura f1 = new Factura();
		f1.estado = Estado.EMITIDA;
		System.out.println("La criticiad de la factura es " + f1.estado.getCriticidad());
		
		f1.estado = Estado.EMITIDA;
		
	}
}

class Factura {
	public String nombreCliente;
	public float importe;
	public Estado estado;
}
