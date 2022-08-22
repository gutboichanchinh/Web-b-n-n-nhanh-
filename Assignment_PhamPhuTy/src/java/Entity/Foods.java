/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author ASUS
 */
public class Foods {
    private int id;
    private String name;
    private String image;
    private int price;
    private String description;
    private String RestaurantName;

    public Foods() {
    }

    public Foods(int id, String name, String image, int price, String description, String RestaurantName) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.description = description;
        this.RestaurantName = RestaurantName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    
      public String getDescriptionShort() {
        return (description.length()>90)? description.substring(0,90)+"..." : description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String RestaurantName) {
        this.RestaurantName = RestaurantName;
    }

    @Override
    public String toString() {
        return "Foods{" + "id=" + id + ", name=" + name + ", image=" + image + ", price=" + price + ", description=" + description + ", RestaurantName=" + RestaurantName + '}';
    }
    
    
    
    
}
