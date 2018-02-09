package com.dta.developer.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;

@Entity
public class Pizza {

	
	@Id private @NonNull String code;
    private @NonNull String name;
    private @NonNull Double price;
    private String giphyUrl;
    
    public Pizza() {}
    
	public Pizza(String code, String name, Double price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getGiphyUrl() {
		return giphyUrl;
	}

	public void setGiphyUrl(String giphyUrl) {
		this.giphyUrl = giphyUrl;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
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
		Pizza other = (Pizza) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pizza [code=" + code + ", name=" + name + ", price=" + price + "]";
	}
	
}
