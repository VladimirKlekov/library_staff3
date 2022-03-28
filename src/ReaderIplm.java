import Interface.Administrator;
import Interface.Reader;
import Interface.Supplier;

public class ReaderIplm extends UserImpl implements Reader, Supplier {
    public ReaderIplm(String name) {
        super(name);
    }

   @Override
    public void takeBook(Administrator administrators) {
        System.out.println(this + " => берет книги у  " + administrators);
    }

    @Override
    public void returnBook(Administrator administrators) {
        System.out.println(this + " => возвращает книги  " + administrators);
    }

    @Override
    public void Delivery(Administrator administrator) {
        System.out.println(this + " => доставляет книги " + administrator);
    }


}
