package ch13_inheritance.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("자바의 정석", "남궁성");
        book.showInfo();
        System.out.println();

        EBook eBook = new EBook("스프링 입문", "이강준", 5.2, "EPUB");
        eBook.setFormat("PDF");

        System.out.println("이 전자책의 포맷은 " + eBook.getFormat() + "입니다.");
        System.out.println();

        eBook.display();
        System.out.println();

        eBook.showInfo();
    }
}
