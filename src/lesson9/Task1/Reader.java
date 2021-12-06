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

    public void takeBook(int n){
        System.out.println(FIO + " взял "+n+" книги.");
        System.out.println("");
    }
    void takeBook (String[] arr){
        System.out.println(FIO+ " взял книги: "+Arrays.toString(arr));
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

    public void getInfo(){
        System.out.println("ФИО: "+FIO);
        System.out.println("Номер читательского билета: "+nomerChitatelskogo);
        System.out.println("Факультет: "+Facultet);
        System.out.println("Дата рождения: "+dateOfBirth);
        System.out.println("Номер телефона: "+telephoneNumber);
        System.out.println("");
    }

}
