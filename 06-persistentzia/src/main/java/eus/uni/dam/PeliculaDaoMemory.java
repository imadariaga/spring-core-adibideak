package eus.uni.dam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Repository;

@Repository
public class PeliculaDaoMemory implements PeliculaDao{

	public List<Pelicula> pelis = new ArrayList<>();

	PeliculaDaoMemory() {

	};

	public Collection<Pelicula> getPeliculas() {
		return pelis;
	};

	@PostConstruct
	public void init() {
		pelis.add(new Pelicula(1, "Vengadores: Infinity War", "2018", new ArrayList()));
		pelis.add(new Pelicula(2, "Black Panther", "2018", new ArrayList<String>(Arrays.asList("Ciencia ficción"))));
		pelis.add(new Pelicula(3, "Han Solo", "2018", new ArrayList<String>(Arrays.asList("Acción"))));
		pelis.add(new Pelicula(4, "Ocean's 8", "2018", new ArrayList<String>(Arrays.asList("Acción"))));
		pelis.add(new Pelicula(5, "Tom Raider", "2018", new ArrayList<String>(Arrays.asList("Aventuras"))));
		pelis.add(new Pelicula(6, "Campeones", "2018", new ArrayList<String>(Arrays.asList("Comedia", "Social", "Deportes"))));
		
		
	}

	public Collection<Pelicula> findAll() {
		return pelis;
	}

	public void insert(Pelicula pelicula) {
		pelis.add(pelicula);
	};

	public void edit(Pelicula pelicula) {
		// pelikulen zerrendan id berdina daukan pelicula bilatu eta aldatu
	};

	public void delete(long id) {
		// pelikulen zerrendatik, id hori daukana bilatu eta ezabatu
	};

	/**
	 * Programa bukatu aurretik, memorian dauzkagun datuak inprimatuko ditugu. 
	 */
	@PreDestroy
	public void destroy() {
		
	}
}
