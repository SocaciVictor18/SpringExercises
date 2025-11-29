import Ex1.Cat;
import Ex1.Dog;
import Ex1.Parrot;
import Ex1.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    static void main() {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        Cat cat1 = new Cat();
        cat1.setName("Mala");

        Supplier<Cat> catSupplier = () -> cat1;
        context.registerBean("cat1", Cat.class, catSupplier);

        Cat catContext = context.getBean("cat1", Cat.class);
        System.out.println(catContext.getName());

//        Dog dog = context.getBean(Dog.class);
//
//        System.out.println(dog);
//        System.out.println(dog.getName());

//        Parrot parot1 = context.getBean(Parrot.class);
//        Parrot parot2 = context.getBean("parrot2",Parrot.class);
//        Parrot parot3= context.getBean("parrot3",Parrot.class);
//
//        System.out.println(parot1.getName());
//        System.out.println(parot2.getName());
//        System.out.println(parot3.getName());
//
//        String hello = context.getBean(String.class);
//        System.out.println(hello);
//
//        Integer ten = context.getBean(Integer.class);
//        System.out.println(ten);
    }
}
