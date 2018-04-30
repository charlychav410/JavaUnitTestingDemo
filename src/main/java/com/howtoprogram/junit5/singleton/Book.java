package com.howtoprogram.junit5.singleton;

public class Book {

	private String nombre;
	private static Book book;
	
	public Book() {
		System.out.println("Constructor");
	}
	
	public static Book getInstance() {
		if(book == null) {
			book=new Book();
		}
		return book;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
