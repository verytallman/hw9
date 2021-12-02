package lesson9.Task1;

import java.util.Arrays;

public class Reader {
    public String FIO;
    private String nomerChitatelskogo;
    private String Facultet;
    private String dateOfBirth;
    private String telephoneNumber;

    public Reader(String FIO, String nomerChitatelskogo, String facultet, String dateOfBirth, String telephoneNumber) {
        this.FIO = FIO;
        this.nomerChitatelskogo = nomerChitatelskogo;
        this.Facultet = facultet;
        this.dateOfBirth = dateOfBirth;
        this.telephoneNumber = telephoneNumber;
    }

    public void takeBook (String str1){
        System.out.println("Беру книгу " + str1);
        System.out.println("");
    }
    void takeBook(int n){
        System.out.println(FIO + " взял "+n+" книги.");
        System.out.println("");
    }
    void takeBook (String[] arr){
        System.out.println(FIO+ " взял книги: "+Arrays.toString(arr));
        System.out.println("");
    }

    public void returnBook(String str2){
        System.out.println("Возвращаю книгу "+ str2);
        System.out.println("");
    }
    void returnBook(int n){
        System.out.println(FIO + " вернул "+n+" книги.");
        System.out.println("");
    }
    void returnBook (String[] arr){
        System.out.println(FIO+ " вернул книги: "+Arrays.toString(arr));
        System.out.println("");
    }




}
