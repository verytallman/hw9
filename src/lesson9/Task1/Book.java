package lesson9.Task1;

public class Book {
    private String NameOfBook;
    private String Author;
    public String FIO;

    public Book(String nameOfBook, String author) {
        NameOfBook = nameOfBook;
        Author = author;
    }

    void takeBook (String nameOfBook, String author) {
        NameOfBook = nameOfBook;
        Author = author;
        System.out.println(FIO+" взял книги: "+NameOfBook+" "+"автора "+Author);
        System.out.println("");
    }


    void takeBook (){
        System.out.println(FIO+" взял книги: "+NameOfBook+" "+"автора "+Author);
        System.out.println("");
    }

    void returnBook (String nameOfBook, String author) {
        NameOfBook = nameOfBook;
        Author = author;
        System.out.println(FIO+" взял книги: "+NameOfBook+" "+"автора "+Author);
        System.out.println("");
    }

    void returnBook(){
        System.out.println(FIO+ " вернул книги: "+ NameOfBook+" "+"автора "+Author);
        System.out.println("");
    }

    public void getInfo (){
        System.out.println("Name of Book: "+NameOfBook);
        System.out.println("Author of Book: "+Author);
        System.out.println("");

    }


}

