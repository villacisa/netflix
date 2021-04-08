package netflix;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
	
	private int numero;
	private List<Capitulo> capitulos = new ArrayList<Capitulo>();
	private Serie serie;
	
	public String listaCapitulos() {
		StringBuilder sb = new StringBuilder();
		for(Capitulo cap:capitulos) {
			sb.append(cap);
		}
		return sb.toString();
	}
	
	public Temporada() {
		super();
	}
	
	public Temporada(int numero, Serie serie) {
		this.numero = numero;
		this.serie = serie;
		capitulos = new ArrayList<Capitulo>();
	}
	
	
}
