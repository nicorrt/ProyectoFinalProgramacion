package com.anramirez.proyectoFinal.modelo;

import java.util.ArrayList;

public class Client {
	
	//Lazy en las N, eagle en las 1
	private int _idClient;
	private String name;
	private String dni;
	private int age;
	private int phone;
	private String country;
	private ArrayList<Artwork> artWorkBuyed;
	
	//Constructor completo
	public Client(int _idClient, String dni, String name, int age, int phone, String country, ArrayList<Artwork> artWorkBuyed) {
		super();
		this._idClient = _idClient;
		this.dni= dni;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.country = country;
		this.artWorkBuyed = artWorkBuyed;
	}
	
	//Constructor sin las obras compradas
	public Client(int _idClient,String dni, String name, int age, int phone, String country) {
		super();
		this._idClient = _idClient;
		this.dni = dni;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.country = country;
	}


	//Constructor vacío
	protected Client() {
		super();
	}
	//Constructor óptimo
	protected Client(int _idClient,String dni, String name, String country) {
		super();
		this._idClient = _idClient;
		this.dni = dni;
		this.name = name;
		this.country = country;
	}
	//Metodos Getters y Setters de los atributos


	public int get_idClient() {
		return _idClient;
	}

	public void set_idClient(int _idClient) {
		this._idClient = _idClient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public ArrayList<Artwork> getArtWorkBuyed() {
		return artWorkBuyed;
	}

	public void setArtWorkBuyed(ArrayList<Artwork> artWorkBuyed) {
		this.artWorkBuyed = artWorkBuyed;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (_idClient != other._idClient)
			return false;
		if (age != other.age)
			return false;
		if (artWorkBuyed == null) {
			if (other.artWorkBuyed != null)
				return false;
		} else if (!artWorkBuyed.equals(other.artWorkBuyed))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone != other.phone)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + _idClient;
		result = prime * result + age;
		result = prime * result + ((artWorkBuyed == null) ? 0 : artWorkBuyed.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + phone;
		return result;
	}

	
	
	
	
	
}