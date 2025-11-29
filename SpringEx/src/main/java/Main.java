import Ex1.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    static void main() {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);

        System.out.println(
                "Person's name: " + person.getName());

        System.out.println(
                "Parrot's name: " + parrot.getName());

        System.out.println(
                "Person's parrot: " + person.getParrot());


//        var context =
//                new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Cat cat1 = new Cat();
//        cat1.setName("Mala");
//
//        Cat cat2 = new Cat();
//        cat2.setName("Miti");
//
//        Supplier<Cat> catSupplier2 = () -> cat2;
//        context.registerBean("cat2",
//                Cat.class,
//                catSupplier2,
//                bc-> bc.setPrimary(true));
//
//        Supplier<Cat> catSupplier = () -> cat1;
//        context.registerBean("cat1", Cat.class, catSupplier);
//
//        Cat catContext = context.getBean("cat1", Cat.class);
//        System.out.println(catContext.getName());
//
//        Cat catContext2 = context.getBean(Cat.class);
//        System.out.println(catContext2.getName());

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
