package by.htp.chef;

import java.util.Arrays;

import by.htp.chef.generativevegetable.bean.Pea;
import by.htp.chef.vegetativevegetable.bulbous.Onion;
import by.htp.chef.vegetativevegetable.klybneplodny.Potato;
import by.htp.chef.vegetativevegetable.listostebelny.Cabbage;
import by.htp.chef.vegetativevegetable.rhizocarpous.Beet;
import by.htp.chef.vegetativevegetable.rhizocarpous.Carrot;
import by.htp.chef.vegetativevegetable.rhizocarpous.Parsley;

public class Main {

	public static void main(String[] args) {
		
		Recipe vinagrette = new Recipe();
		vinagrette.addIngredient(new Ingredient(new Beet(), 0.25));
		vinagrette.addIngredient(new Ingredient(new Potato(), 0.5));
		vinagrette.addIngredient(new Ingredient(new Pea(), 0.05));
		vinagrette.calculateCalories();
		System.out.println("В салате " + vinagrette.calculateCalories() + " калории(й)");
		
		Recipe cabbage = new Recipe();
		cabbage.addIngredient(new Ingredient(new Cabbage(),0.3));
		cabbage.addIngredient(new Ingredient(new Carrot(),0.2));
		cabbage.addIngredient(new Ingredient(new Onion(),0.01));
		cabbage.addIngredient(new Ingredient(new Parsley(),0.05));
		cabbage.calculateCalories();
		System.out.println("В салате " + cabbage.calculateCalories() + " калории(й)");
		
		cabbage.caloricitySort();
		System.out.println(Arrays.toString(cabbage.caloricitySort()));
		
		
		//vinagrette.caloricitySort();
		//System.out.println(Arrays.toString(vinagrette.caloricitySort()));
		
		//vinagrette.findVegetables();
		//System.out.println(Arrays.toString(vinagrette.findVegetables()));
		
		
	}

}
