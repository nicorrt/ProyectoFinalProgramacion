package com.anramirez.proyectoFinal.modelo;

import java.util.Date;

import javafx.scene.image.Image;

public interface IArtwork {
	
	public void setName(String name);
	public void setArtist(String name);
	public void setPrice(float price);
	public void setStyle (String style);
	public void setBuyer (Client buyer);
	public void setYear(Date year);
	public void setCountry(String country);
	public void setAvailable(boolean available);
	public void setPicture (Image picture);
	public String getName();
	public String getArtist();
	public float getPrice();
	public String getStyle();
	public Client getBuyer();
	public Date getYear();
	public String getCountry();
	public boolean getAvailable();
	public Image getPicture();
	

}
