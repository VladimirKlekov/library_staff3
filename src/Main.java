import Interface.Administrator;
import Interface.Librarian;

public class Main {

    public static void main(String[] args) {

        ReaderIplm kolya = new ReaderIplm("Reader + Supplier");
        AdministratorImpl andrei = new AdministratorImpl("Administrator + Librarian");
        
        System.out.println("Читатель и он же поставщик: " + kolya);
        System.out.println("Администратор и он же библиотекарь: " + andrei);

        System.out.println("_____________________________________________");
        andrei.findBook();
        andrei.issuanceBooks(kolya);
        kolya.takeBook(andrei);
        andrei.Controls(kolya);
        kolya.returnBook(andrei);
        andrei.Orders(kolya);
        kolya.Delivery(andrei);



}

    }


