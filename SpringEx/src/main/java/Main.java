import Ex1.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context =
                new AnnotationConfigApplicationContext();

        Parrot parot = new Parrot();
    }
}
