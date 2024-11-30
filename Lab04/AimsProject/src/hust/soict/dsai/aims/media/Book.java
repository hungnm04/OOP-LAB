package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class Book extends Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    private ArrayList<String> authors = new ArrayList<>();

    // Default constructor
    public Book() {
        super();
    }

    // Constructor with all attributes
    public Book(int id, String title, String category, float cost, ArrayList<String> authors) {
        super(title, category, cost);
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.authors = authors;
    }

    // Add this constructor to the Book class
    public Book(String title, String author, float cost) {
        super(title);
        this.title = title;
        this.cost = cost;
        this.authors.add(author); // Add the author to the list
    }


    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    // Add an author to the list
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Author added: " + authorName);
        } else {
            System.out.println("Author already exists.");
        }
    }

    // Remove an author from the list
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author removed: " + authorName);
        } else {
            System.out.println("Author not found.");
        }
    }

    @Override
    public String getType() {
        return "Book";
    }

    @Override
    public String getDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Book Details:\n");
        details.append("ID: ").append(id).append("\n");
        details.append("Title: ").append(title).append("\n");
        details.append("Category: ").append(category).append("\n");
        details.append("Cost: $").append(cost).append("\n");
        details.append("Authors: ").append(authors.isEmpty() ? "None" : String.join(", ", authors)).append("\n");
        return details.toString();
    }
}
