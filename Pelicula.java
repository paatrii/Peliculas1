package Pelicula1;

import java.sql.*;
import java.time.Year;

public class Pelicula {
	
	public java.util.Collection actor = new java.util.TreeSet();
	public java.util.Collection director = new java.util.TreeSet();
	public java.util.Collection productor = new java.util.TreeSet();
	public java.util.Collection guionista = new java.util.TreeSet();
	
	
	private String titulo;
	
	private Year agno;
	
	private String sinopsis;
	
	private Genero genero;
	
	private String pais;
	
	public Trailer trailer;
	
	public Pelicula() {
		trailer = new Trailer();
		
	}
	
	public enum Genero
	{
		drama, comedia, accion, terror, romance, aventra, sciFi
	}

}
