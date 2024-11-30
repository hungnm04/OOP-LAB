package hust.soict.dsai.aims.media;

import java.util.List;
import java.util.ArrayList;

public class Polymorphism {

    public static void main(String[] args) {
        List<Media> media = new ArrayList<Media>();
        CompactDisc cd = new CompactDisc("Messi","Messi","Rodiguez",6.00f);
        DigitalVideoDisc dvd = new DigitalVideoDisc("Ronaldo","Cristiano","Rodrygo",7,8.52f);
        Book book = new Book("Neymar","Junior",5.32f);
        media.add(cd);
        media.add(dvd);
        media.add(book);

        for(Media m: media) {
            System.out.println(m.toString());
        }
    }

}
