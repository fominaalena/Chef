package by.htp.chef;

import java.util.Arrays;
import java.util.Scanner;

public class Ingredient {
	
	public final Vegetable vegetable;
	public final double weigth;
	
	public Ingredient(Vegetable vegetable, double weigth) {
		this.vegetable = vegetable;
		this.weigth = weigth;
	}

	@Override
	public String toString() {
		return "Ingredient [vegetable=" + vegetable + ", weigth=" + weigth + "]";
	}
	
	
}
