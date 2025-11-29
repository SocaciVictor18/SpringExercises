import Ex1.Parrot;
import Ex1.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parot = context.getBean(Parrot.class);

        System.out.println(parot.getName());

        String hello = context.getBean(String.class);
        System.out.println(hello);

        Integer ten = context.getBean(Integer.class);
        System.out.println(ten);
    }
}
