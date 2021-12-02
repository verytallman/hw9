package lesson9.Task1;

import javax.imageio.stream.FileImageOutputStream;
import java.util.Arrays;
import java.util.SortedMap;

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


}

