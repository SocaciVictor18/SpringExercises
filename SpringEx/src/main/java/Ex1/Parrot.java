package Ex1;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Koko";

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
