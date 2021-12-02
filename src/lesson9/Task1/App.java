package lesson9.Task1;



public class App {

    public static void main(String[] args) {
        Reader NewReader = new Reader("Дегтярев А. В.","Н125128ОНSYW","Физико-математический","12.03.1995",
                "+38095942562");

        NewReader.takeBook("Война и Мир");
        NewReader.takeBook(3);
        NewReader.takeBook(new String[] {"Приключения", "Словарь", "Энциклопедия"});
        NewReader.returnBook("Энциклопедия");
        NewReader.returnBook(2);
        NewReader.returnBook(new String[] {"Рашпиль для новичков","Любимый роман Донцовой"});


        Book NewBook = new Book("Идиот","Федор Достоевский");
        Book NewBook1 = new Book("451 градус по Фаренгейту","Рєй Брєдбєри");
        NewBook.FIO = NewReader.FIO;
        NewBook1.FIO = NewReader.FIO;
        NewBook.takeBook();
        NewBook1.returnBook();

    }
}
