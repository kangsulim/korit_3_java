package ch13_inheritance.book;

public class Book {
    private String title, author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
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

    void showInfo() {
        System.out.println("이 책의 제목은 " + getTitle() + "입니다.");
        System.out.println("이 책의 저자는 " + getAuthor() + "입니다.");
    }
}
