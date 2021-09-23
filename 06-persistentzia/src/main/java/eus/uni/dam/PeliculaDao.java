package eus.uni.dam;

import java.util.Collection;

public interface PeliculaDao {

	public Collection<Pelicula> getPeliculas();
	
    public void init();

	public Collection<Pelicula> findAll() ;

	public void insert(Pelicula pelicula);

	public void edit(Pelicula pelicula);
	
	public void delete(long id) ;
}
