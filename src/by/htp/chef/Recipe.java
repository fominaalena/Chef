package by.htp.chef;

import java.util.Scanner;

public class Recipe {
	
	Ingredient[] ingredients = new Ingredient[10];
	int j = 0;
		
	public void addIngredient(Ingredient ingredient) {
		ingredients[j] = ingredient;
		j++;
	}
	
	public double calculateCalories() {
		double caloricity = 0;
		for (int i = 0 ; i < j; i++) {
			caloricity += ingredients[i].weigth*ingredients[i].vegetable.getKkal();
		}
		return caloricity;
	}
	
	public Ingredient[] caloricitySort() {
        for (int i = ingredients.length - 1; i >= 0; i--) {
             for (int j = 0; j < i; j++) {
            	 if (ingredients[i] != null) {
                 if (ingredients[i].vegetable.getKkal() > ingredients[j + 1].vegetable.getKkal()) {
                      Ingredient t = ingredients[j];
                      ingredients[j] = ingredients[j + 1];
                      ingredients[j + 1] = t;
                 }
             }
        }
     }
        return ingredients;
    }

	public Ingredient[] findVegetables() {
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите нижнюю границу калорийности:");
		int a = in.nextInt();
		System.out.println("¬ведите верхнюю границу калорийности:");
		int b = in.nextInt();
		Ingredient [] result = new Ingredient[ingredients.length];
		for (int i = 0; i < j; i++) {
			if (ingredients[i].vegetable.getKkal() >= a | ingredients[i].vegetable.getKkal() <= b) {
				result[i] = ingredients[i];
			}
		}
		return result;
	}
}
