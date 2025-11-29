import Ex1.Parrot;
import Ex1.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parot1 = context.getBean("parrot", Parrot.class);
        Parrot parot2 = context.getBean("parrot2",Parrot.class);
        Parrot parot3= context.getBean("parrot3",Parrot.class);

        System.out.println(parot1.getName());
        System.out.println(parot2.getName());
        System.out.println(parot3.getName());

        String hello = context.getBean(String.class);
        System.out.println(hello);

        Integer ten = context.getBean(Integer.class);
        System.out.println(ten);
    }
}
