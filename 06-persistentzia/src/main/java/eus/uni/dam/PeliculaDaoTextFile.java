package eus.uni.dam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

@Repository
public class PeliculaDaoTextFile implements PeliculaDao {

	String filename = "Peliak.csv";
	public List<Pelicula> peliculas = new ArrayList<>();

	PeliculaDaoTextFile() {

	};

	public Collection<Pelicula> getPeliculas() {
		return peliculas;
	};

	/**
	 * Hasieran, fitxategia irakurri eta datuak memorian, zerrenda baten kargatuko
	 * dira. Stream-ak erabiliz.
	 * 
	 */
	@PostConstruct
	public void init() {
		// TO-DO
	}

	/**
	 * Memorian, aurretik kargatu dugun zerrenda itzultzen du metodo honek
	 * 
	 */
	public Collection<Pelicula> findAll() {
		return peliculas;
	}

	/**
	 * Pelikula berri bat txertatzen du memoriako zerrendan
	 * 
	 * @param pelicula
	 */
	public void insert(Pelicula pelicula) {
		peliculas.add(pelicula);
	};

	/**
	 * Pelikulen zerrendan id berdina daukan pelikula bilatu eta aldatu
	 * 
	 * @param pelicula
	 */
	public void edit(Pelicula pelicula) {
		// TO-DO
	};

	/**
	 * Pelikulen zerrendatik, id hori daukana bilatu eta ezabatu
	 * 
	 * @param id
	 */
	public void delete(long id) {
		// TO-DO
	};

	/**
	 * Katalogoa berriz behar ez dugunean, memorian daukagun zerrenda testu
	 * fitxategi baten egingo dugu persistente.
	 * 
	 */
	@PreDestroy
	public void destroy() {
		String filename = "FileOuta.csv";
		PrintWriter outputStream = null;

		try {
			ClassPathResource fileResource = new ClassPathResource(filename);
			outputStream = new PrintWriter(new FileWriter(fileResource.getFile()));

			String l;
			for (Pelicula p : peliculas) {
				outputStream.println(p.getId() + "," + p.getTitulo() + "," + p.getAnyo());
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (outputStream != null) {
				outputStream.close();
				System.out.println("Datuak gorde dira " + filename +" fitxategian.");
			}
		}
	}
}
