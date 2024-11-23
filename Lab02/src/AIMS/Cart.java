package AIMS;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;

    public Cart() {
        qtyOrdered = 0;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc '" + disc.getTitle() + "' has been added!");
            if (qtyOrdered == MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is full!");
            }
        } 
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
    	boolean found = false;
    	 for (int i = 0; i < qtyOrdered; i++) {
    		 if(itemsOrdered[i] == disc) {
    			 found = true;
    			 for (int j = i; j < qtyOrdered - 1; j++) {
                     itemsOrdered[j] = itemsOrdered[j + 1];
                 }
    			 itemsOrdered[qtyOrdered - 1] = null;
                 qtyOrdered--;
                 System.out.println("The disc '" + disc.getTitle() + "' has been removed!");
                 break;
    		 }
    	 }
    	 if (!found) {
             System.out.println("The disc was not found.");
         }
    }
    
    public double totalCost() {
    	double sum = 0.0;
    	for (int i = 0; i < qtyOrdered; i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        double total = 0.0;
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
            total += itemsOrdered[i].getCost();
        }
        System.out.println("Total cost: " + total + " $");
        System.out.println("***************************************************");
    }
    public void searchById(int id) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("Found: " + itemsOrdered[i].toString());
                return;
            }
        }
        System.out.println("No match found for ID: " + id);
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println("Found: " + itemsOrdered[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No match found for title: " + title);
        }
    }

}