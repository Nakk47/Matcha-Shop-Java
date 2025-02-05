package Shop;

import java.util.List;

public class Drink {

    // Attributes for a drink
    private String name;
    private double price;
    private String category;  // e.g., "Creamy", "Fruity", "Refreshing", "Indulgent"
    private List<String> ingredients; // e.g., ["Matcha", "Milk", "Honey"]

    // Constructor
    public Drink(String name, double price, String category, List<String> ingredients) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.ingredients = ingredients;
    }

    // Getters
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    // Setters
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}
