package eus.uni.dam;

public class Pertsona {

	String izena = "Lulú";

	Pertsona(String izena){
		this.izena = izena;
	}
	
	public void setIzena(String izenBerria) {
		izena = izenBerria;
	}
	
	public void aurkeztu() {
		System.out.println("Kaixo, ni " + izena + " naiz. Urte askotarako.");
	}
}
