package com.anramirez.proyectoFinal.modelo;

import java.util.Date;

import javafx.scene.image.Image;

public abstract class Artwork implements IArtwork {
	
	private int _idArtwork;
	private String name;
	private String artist;
	private float price;
	private String style;
	private Client buyer;
	private Date year;
	private String country;
	private boolean available;
	private Image picture;
	protected Artwork(int _idArtwork, String name, String artist, float price, String style, Client buyer, Date year,
			String country, boolean available, Image picture) {
		super();
		this._idArtwork = _idArtwork;
		this.name = name;
		this.artist = artist;
		this.price = price;
		this.style = style;
		this.buyer = buyer;
		this.year = year;
		this.country = country;
		this.available = available;
		this.picture = picture;
	}
	protected Artwork() {
		super();
	}
	public int get_idArtwork() {
		return _idArtwork;
	}
	public void set_idArtwork(int _idArtwork) {
		this._idArtwork = _idArtwork;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public Client getBuyer() {
		return buyer;
	}
	public void setBuyer(Client buyer) {
		this.buyer = buyer;
	}
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public Image getPicture() {
		return picture;
	}
	public void setPicture(Image picture) {
		this.picture = picture;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + _idArtwork;
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result + (available ? 1231 : 1237);
		result = prime * result + ((buyer == null) ? 0 : buyer.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((picture == null) ? 0 : picture.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + ((style == null) ? 0 : style.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artwork other = (Artwork) obj;
		if (_idArtwork != other._idArtwork)
			return false;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (available != other.available)
			return false;
		if (buyer == null) {
			if (other.buyer != null)
				return false;
		} else if (!buyer.equals(other.buyer))
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
		if (picture == null) {
			if (other.picture != null)
				return false;
		} else if (!picture.equals(other.picture))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (style == null) {
			if (other.style != null)
				return false;
		} else if (!style.equals(other.style))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Artwork [_idArtwork=" + _idArtwork + ", name=" + name + ", artist=" + artist + ", price=" + price
				+ ", style=" + style + ", buyer=" + buyer + ", year=" + year + ", country=" + country + ", available="
				+ available + ", picture=" + picture + "]";
	}
		
	

}
