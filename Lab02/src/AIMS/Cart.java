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
}