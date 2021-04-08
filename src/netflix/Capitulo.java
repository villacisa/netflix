package netflix;

import java.util.ArrayList;

public class Capitulo {
	protected int duration;
	public final int DURATION=5;
	protected int num;
	protected Temporada temporada;
	protected ArrayList<Personaje> personajes;
	
	public Capitulo(int num, Temporada temporada) {
		this.num = num;
		this.temporada = temporada;
	}
	
	public String listaPersonajes() {
		StringBuffer sb = new StringBuffer();
		for(Personaje per:personajes) {
			sb.append(per);
		}
		return sb.toString();
	}
}
