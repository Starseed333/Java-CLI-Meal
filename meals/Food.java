package meals;

import java.util.Date;

public class Food {

	private long id;
	private String name;
	private String brand;
	private boolean isDrink;
	private double calories;
	private double fat;
	private double carbohydrates;
	private double protein;

	public Food() {

	}

	public Food(long id){
		this.id = id;
	}

	public long getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getBrand(){
		return brand;
	}

	public void setBrand (String brand){
		this.brand = brand;
	}

	public boolean isDrink(){
		return isDrink;
	}

	public void setIsDrink(boolean isDrink){
		this.isDrink = isDrink;
	}

	public double getCalories(){
		return calories;
	}

	public void setCalories(double calories){
		this.calories = calories;
	}

	public double getFats(){
		return fats;
	}

	public void setFats(double fats){
		this.fats = fats;
	}

	public double getCarbohydrates(){
		return carbohydrates;
	}

	public void setCarbohydrates(double carbohydrates){
		this.carbohydrates = carbohydrates;
	}

	public double getProtein(){
		return protein;
	}

	@Override
	 public static void main (String[] args){
	 	Systetem.out.println(String.format("id=" this.getId()) + "\n");


	 }


}
