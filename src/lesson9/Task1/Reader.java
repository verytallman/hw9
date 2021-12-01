package lesson9.Task1;

import java.util.Arrays;

public class Reader {
   private String FIO;
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
        System.out.println(str1);
    }
    void takeBook(int n){
        System.out.println(FIO + " взял "+n+" книги.");
    }
    void takeBook (String[] arr){
        System.out.println(FIO+ " взял книги: "+Arrays.toString(arr));
    }
    public void returnBook(String str2){
        System.out.println(str2);
    }
}
