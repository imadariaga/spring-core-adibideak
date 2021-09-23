package eus.uni.dam;

	
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Repository;

@Repository
public class PeliculaDaoJdbc  implements PeliculaDao{

	public List<Pelicula> peliculas = new ArrayList<>();

	PeliculaDaoJdbc() {

	};

	public Collection<Pelicula> getPeliculas() {
		return peliculas;
	};

	/** Datu-basetik datuak berreskuratu eta memoriako zerrendan kargatu. 
	 *  
	 */
	@PostConstruct
	public void init() {
		
	}

	public Collection<Pelicula> findAll() {
		return peliculas;
	}

	/** DBan INSERT bat egin, eta dena ondo balego, memorian be egin insert-a.
	 * 
	 * @param pelicula
	 */
	public void insert(Pelicula pelicula) {
		// DBan insert-a
		peliculas.add(pelicula);
	};

	/** DBan UPDATE bat egin, eta dena ondo balego, memorian be...
	 *  
	 * @param pelicula
	 */
	public void edit(Pelicula pelicula) {
		//TO-DO
	};
	
	/**
	 * DBan DELETE bat egin, eta dena ondo balego, memorian be 
	 * @param id
	 */	
	public void delete(long id) {
		//TO-DO
	};

	/** Momentuoro, aldaketak, bai memorian, bai dban bertan egin izan ditugu,
	 *  beraz, ez da beharrezkoa orain zerrendako datuak dban berriz gordetzea. 
	 *  (DB-an beste norbaitek, beste aplikazio batetik 
	 *  eginiko aldaketez ez gara enteratzen. Kontuz)   
	 * 
	 */
	@PreDestroy
	public void destroy() {
		
	}
}
