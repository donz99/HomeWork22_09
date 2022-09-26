package HomeWork22_09;

public class Reader {
    private String name;
    private int number;
    private String fak;
    private String bd;
    private int phone;

    public Reader(){
        name="";
        number=0;
        fak="";
        bd="";
        phone=0;
    }
    public Reader(String name, int number, String fak, String bd, int phone){
        this.name=name;
        this.number=number;
        this.fak=fak;
        this.bd=bd;
        this.phone=phone;
    }



    public void takeBook(int book){
        System.out.println(this.name+" взял "+ book + " книги");
    }

    public void takeBook(String book1, String book2, String book3) {
        System.out.println(this.name + " взял книги: "+ book1+", "+book2+", "+book3);
    }

    public void takeBook(Book book1, Book book2, Book book3) {
        System.out.println(this.name + " взял книги: "+ book1.getNaimBook()+", "+book2.getNaimBook()+", "+book3.getNaimBook());
    }



    public void returnBook(int book){
        System.out.println(this.name+" вернул "+ book + " книги");
    }

    public void returnBook(String book1, String book2, String book3) {
        System.out.println(this.name + " вернул книги: "+ book1+", "+book2+", "+book3);
    }

    public void returnBook(Book book1, Book book2, Book book3) {
        System.out.println(this.name + " вернул книги: "+ book1.getNaimBook()+", "+book2.getNaimBook()+", "+book3.getNaimBook());
    }

    public String getName() {        return name;    }
    public void setName(String name) {        this.name = name;    }
    public int getNumber() {        return number;    }
    public void setNumber(int number) {        this.number = number;    }
    public String getFak() {        return fak;    }
    public void setFak(String fak) {        this.fak = fak;    }
    public String getBd() {        return bd;    }
    public void setBd(String bd) {        this.bd = bd;    }
    public int getPhone() {        return phone;    }
    public void setPhone(int phone) {        this.phone = phone;    }

}
