package by.htp.chef;

import java.util.Scanner;

import by.htp.chef.generativevegetable.bean.Bean;
import by.htp.chef.generativevegetable.bean.Haricot;

public abstract class Vegetable {
	
	private String name;
	private int kkal;
	private String color;
	private String taste;
	
	public Vegetable() {
		
	}
	
	public Vegetable(String name, int kkal, String color, String taste) {
		this.name = name;
		this.kkal = kkal;
		this.color = color;
		this.taste = taste;
	}

	public String getName() {
		return name;
	}

	public int getKkal() {
		return kkal;
	}

	public String getColor() {
		return color;
	}

	public String getTaste() {
		return taste;
	}
	
	@Override
	public String toString() {
		return name + ", kkal=" + kkal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + kkal;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((taste == null) ? 0 : taste.hashCode());
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
		Vegetable other = (Vegetable) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (kkal != other.kkal)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (taste == null) {
			if (other.taste != null)
				return false;
		} else if (!taste.equals(other.taste))
			return false;
		return true;
	}
	
	
}
