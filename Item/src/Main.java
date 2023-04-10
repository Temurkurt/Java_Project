public class Main {
    public static void main(String[] args) {
        Item[] itemsArray;
        itemsArray = new Item[5]; // We defined our array

        itemsArray[0] = new Item("Audi Car", "Automotive brand in Germany", 8900.50, 200); // 1st Item

        itemsArray[1] = new Item("Apple PC", "Computer and technology brand in USA", 5000.0,200); // 2nd Item

        // In 3rd item we will use set methods
        itemsArray[2] = new Item();
        itemsArray[2].setName("Monster Pc");
        itemsArray[2].setDescription("Computer brand in Turkey");
        itemsArray[2].setPrice(3200);
        itemsArray[2].setQuantity(500);

        itemsArray[3] = new Item("Chevrolet Car", "Sport car brand in USA", 9000.30,600); //4th Item
        itemsArray[4] = new Item(); // 5th Item to try our function which do its job in no input conditions we don't give any

        System.out.print("Item Details\n");

        for(int i = 0; i < 5; i++){ // to print our Items we will use for loop
            System.out.print("\n\nName: " + itemsArray[i].getName() +
                    "\nDescription: " + itemsArray[i].getDescription() +
                    "\nQuantity: " + itemsArray[i].getQuantity() +
                    "\nPrice: " + itemsArray[i].getPrice());

        }
    }
}