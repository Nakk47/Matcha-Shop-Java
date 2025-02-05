package Shop;
import java.util.List;

public class Shop {
    // Attributes for the shop
    private String shopName;
    private String location;
    private List<Drink> menu; // List of drinks offered

    // Constructor
    public Shop(String shopName, String location, List<Drink> menu) {
        this.shopName = shopName;
        this.location = location;
        this.menu = menu;
    }

    // Getters
    public String getShopName() {
        return shopName;
    }

    
    public String getLocation() {
        return location;
    }
   
    public List<Drink> getMenu() {
        return menu;
    }

    // Setters
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setMenu(List<Drink> menu) {
        this.menu = menu;
    }
}
