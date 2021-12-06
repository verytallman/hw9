package lesson9.Task1;



public class App {

    public static void main(String[] args) {
        Reader ReaderAlexey = new Reader("Дегтярев А. В.", "Н125128ОНSYW", "Физико-математический", "12.03.1995",
                "+38095942562");

        ReaderAlexey.getInfo();
        ReaderAlexey.takeBook(3);
        ReaderAlexey.takeBook(new String[]{"Приключения", "Словарь", "Энциклопедия"});
        ReaderAlexey.returnBook(2);
        ReaderAlexey.returnBook(new String[]{"Рашпиль для новичков", "Любимый роман Донцовой"});

        Reader ReaderRoma = new Reader("Поршнева И. А.", "Н125128О8STQ", "Переводчик", "12.02.1997",
                "+380952561122");

        ReaderRoma.getInfo();
        ReaderRoma.takeBook(2);
        ReaderRoma.takeBook(new String[]{"Роман", "Комедия", "Хоррор"});
        ReaderRoma.returnBook(3);
        ReaderRoma.returnBook(new String[]{"Оно", "Лангольеры"});

        Reader ReaderMax = new Reader("Бус М. Е.", "Н165178О8STZ", "Факультет компьютерных систем", "01.10.1993",
                "+390956722256");

        ReaderMax.getInfo();
        ReaderMax.takeBook(3);
        ReaderMax.takeBook(new String[]{"Атлас", "Мануал по Java", "Мануал по Maven"});
        ReaderMax.returnBook(4);
        ReaderMax.returnBook(new String[]{"Кладбище домашних животных", "Мизери"});


        Book Idiot = new Book("Идиот", "Федор Достоевский");

        Idiot.FIO = ReaderAlexey.FIO;
        Idiot.getInfo();
        Idiot.takeBook();
        Idiot.returnBook();

        Book Farenhiet451 = new Book("451 градус по Фаренгейту", "Рєй Брєдбєри");

        Farenhiet451.FIO = ReaderRoma.FIO;
        Farenhiet451.getInfo();
        Farenhiet451.takeBook();
        Farenhiet451.returnBook();

        Book TheShining = new Book("Сияние", "Стивен Кинг");

        TheShining.FIO = ReaderMax.FIO;
        TheShining.getInfo();
        TheShining.takeBook();
        TheShining.returnBook();

        printBooks(Farenhiet451, Idiot, TheShining);
        printReaders(ReaderAlexey, ReaderMax, ReaderRoma);

    }

    public static void printBooks(Book... booksArr) {
        for (Book books : booksArr) {
            books.getInfo();
        }
    }

    public static void printReaders(Reader... readerArr) {
        for (Reader readers : readerArr) {
            readers.getInfo();
        }
    }
}
