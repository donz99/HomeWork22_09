package HomeWork22_09;

public class Book {
    private String naimBook;
    private String avtorBook;

    public Book(){
        naimBook="";
        avtorBook="";
    }

    public Book(String naimBook, String avtorBook){
        this.naimBook=naimBook;
        this.avtorBook=avtorBook;
    }

    public String getNaimBook() {        return naimBook;    }
    public void setNaimBook(String naimBook) {        this.naimBook = naimBook;    }
    public String getAvtorBook() {        return avtorBook;    }
    public void setAvtorBook(String avtorBook) {        this.avtorBook = avtorBook;    }
}
