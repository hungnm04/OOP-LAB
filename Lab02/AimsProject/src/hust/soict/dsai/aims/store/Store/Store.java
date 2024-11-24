package hust.soict.dsai.aims.store.Store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
    private List<DigitalVideoDisc> itemsInStore;

    public Store() {
        this.itemsInStore = new ArrayList<>();
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (dvd != null) {
            itemsInStore.add(dvd);
            System.out.println(dvd.getTitle() + " has been added to the store.");
        } else {
            System.out.println("Cannot add null DVD to the store.");
        }
    }

    public void removeDVD(String title) {
        boolean removed = false;
        for (int i = 0; i < itemsInStore.size(); i++) {
            if (itemsInStore.get(i).isMatch(title)) {
                itemsInStore.remove(i);
                System.out.println(title + " has been removed from the store.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println(title + " not found in the store.");
        }
    }
    public void displayStore() {
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is currently empty.");
        } else {
            System.out.println("Items in Store:");
            for (DigitalVideoDisc dvd : itemsInStore) {
                System.out.println(dvd.toString());
            }
        }
    }
}
