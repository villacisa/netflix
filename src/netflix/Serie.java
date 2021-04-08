package netflix;

import java.util.ArrayList;
import java.util.List;

public class Serie {
	
	private String titulo;
	private List<Temporada> temporadas = new ArrayList<Temporada>();
	
	
	public Serie(String titulo) {
		this.titulo = titulo;
		//this.temporadas = temporadas;
	}


	public Serie() {
		this.temporadas = new ArrayList<Temporada>();
	}


	
	public void addTemporada(Temporada) {
		temporadas.add(temporada);
		temporada.setSerie(this);
	}

}