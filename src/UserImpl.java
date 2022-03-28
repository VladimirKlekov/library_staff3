import Interface.Administrator;

public abstract class UserImpl {
    private String name;

    public UserImpl(String name) {
        this.name = name;
    }

    public  String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}
