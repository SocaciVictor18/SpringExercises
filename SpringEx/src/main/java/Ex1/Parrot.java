package Ex1;

public class Parrot {
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Parrot : " + name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
