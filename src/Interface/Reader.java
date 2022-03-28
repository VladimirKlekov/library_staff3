package Interface;

public interface Reader {
    // получет книги у администратора
    public void takeBook(Administrator administrators);

    //возвращает книги администратору
    public void returnBook(Administrator administrators);


}
