package eus.uni.dam.three;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pertsona {

	String izena = "Lulú";
	@Autowired
	Titulua titulua; 

	public Pertsona() { 
		
	}

	Pertsona(String izena,Titulua titulua){
		this.izena = izena;
		this.titulua = titulua;
	}
	
	public void setIzena(String izenBerria) {
		izena = izenBerria;
	}
	
	
	public Titulua getTitulua() {
		return titulua;
	}

	public void setTitulua(Titulua titulua) {
		this.titulua = titulua;
	}

	public void aurkeztu() {
		System.out.println("Kaixo, ni " + izena + " naiz. " + titulua.getIzenburua()+
				" titulua lortu nuen "+titulua.getIkastetxea()+" ikastetxean.");
	}
}
