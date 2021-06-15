package com.example.project_rma;

public class Books {
    private String title;
    private String author;
    private String category;
    private String description;
    private int image;

    public Books(String title, String author, String category, int image, String description) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.image=image;
        this.description=description;
    }
    public Books(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getImage() { return image; }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String toString() {
        return "Books{" +
                "Title='" + title+ '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

