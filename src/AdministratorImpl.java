import Interface.Administrator;
import Interface.Librarian;
import Interface.Reader;
import Interface.Supplier;


public class AdministratorImpl extends UserImpl implements Administrator, Librarian {
    private String administratorName;

    public AdministratorImpl(String name) {
        super(name);
    }


    @Override
    public void findBook() {

        System.out.println(this + " => находит книги в библиотеке");
    }

    @Override
    public void issuanceBooks(Reader reader) {
        System.out.println(this + " => выдает книги " + reader);
    }

    @Override
    public void Controls(Reader reader) {
        System.out.println(this + " => уведомляет " + reader + " о просрочке");
    }

    @Override
    public void Orders(Supplier suppliers) {
        System.out.println(this + " => заказывает книги у " + suppliers);

    }

}
