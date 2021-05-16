package com.anramirez.proyectoFinal.modelo;

import java.util.ArrayList;

/**
 * 
 * @author nicor
 * 
 *
 */
public interface IClient {
	
	public void set_idClient(int _id);
	public void setName (String name);
	public void setAge (int age);
	public void setPhone (int phone);
	public void setCountry (String country);
	public void setArtworkByClient (ArrayList<Artwork> Artwork);
	public int get_idClient();
	public String getName();
	public int getAge();
	public int getPhone();
	public String getCountry();
	public ArrayList<Artwork> getArtworkByClient();
	

}
