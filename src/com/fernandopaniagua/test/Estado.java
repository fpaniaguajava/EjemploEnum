package com.fernandopaniagua.test;

public enum Estado {
	EMITIDA, PASADA_A_COBRO, COBRADA, RECHAZADA;
	
	public int getCriticidad() {
		switch(this) {
		case EMITIDA:
			return 1;
		case PASADA_A_COBRO:
			return 2;
		case COBRADA:
			return 3;
		case RECHAZADA:
			return 4;
		}
		return 0;
	}
	
	public void hazAlgo() {
		System.out.println("Hago algo independiente de la enumeración");
	}
}

/*
enum Size{
	  SMALL, MEDIUM, LARGE, EXTRALARGE;

	  public String getSize() {

	    // this will refer to the object SMALL
	    switch(this) {
	      case SMALL:
	        return "small";

	      case MEDIUM:
	        return "medium";

	      case LARGE:
	        return "large";

	      case EXTRALARGE:
	        return "extra large";

	      default:
	        return null;
	      }
	   }
*/