public class Item {

    //Variables
    private String name;
    private String description;
    private double price;
    private int quantity;


 // Constructor
    public Item(String name, String description, double price, int quantity) {

        if(quantity<0){
            throw new IllegalArgumentException("Quantity can not be < 0");
        }

        if(price<0.0){
            throw new IllegalArgumentException("Price can not be < 0");
        }

        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

 // Default constructor
    public Item(){
        this.name = null;
        this.description = null;
        this.quantity = 0;
        this.price = 0.0;
    }


    //Getters and Setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}