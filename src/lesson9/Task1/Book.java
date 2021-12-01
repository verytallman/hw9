package lesson9.Task1;

import javax.imageio.stream.FileImageOutputStream;
import java.util.SortedMap;

public class Book {
    private String NameOfBook;
    private String Author;
    public String FIO;

    public Book(String nameOfBook, String author) {
        NameOfBook = nameOfBook;
        Author = author;
    }

    void takeBook(String nameOfBook, String author) {
        NameOfBook = nameOfBook;
        Author = author;
        System.out.println(FIO+" взял книги: "+NameOfBook+" "+"автора "+Author);


    }


    void takeBook (){
        System.out.println(FIO+" взял книги: "+NameOfBook+" "+"автора "+Author);
    }


}

