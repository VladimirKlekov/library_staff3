package Interface;

public interface Administrator {
// находит книги
    public void findBook();
//выдает книги
    public void issuanceBooks(Reader reader);
    // уведомляет
    public void Controls(Reader reader);
}
