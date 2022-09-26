package HomeWork22_09;

public class Main {
    public static void main(String[] args) {

        Reader r0 = new Reader("Петров В.В.", 1, "ХТиТ", "24.05.1995", 251);
        Reader r1 = new Reader("Иванов Д.В.", 2, "ФОС","12.01.1992", 876);
        Reader[] arrReader = new Reader[2];
        arrReader[0]=r0;
        arrReader[1]=r1;

        r1.takeBook(3);

        Book b1 = new Book("Приключения","Колос");
        Book b2 = new Book("Словарь","Чехов");
        Book b3 = new Book("Энциклопедия","Купала");

        r0.takeBook(b1,b2,b3);

        r0.returnBook(2);
        r1.returnBook(b3,b2,b1);

    }
}

