package Ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Ella";

    private final Parrot parrot;

    public Person(Parrot parrot2) {
        this.parrot = parrot2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }
//    private String name;
//    private Parrot parrot;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Parrot getParrot() {
//        return parrot;
//    }
//
//    public void setParrot(Parrot parrot) {
//        this.parrot = parrot;
//    }
//    private String name ="Ella";
//
////    @Autowired
////    private Parrot parrot;
//    private Parrot parrot;
//
//
////    @Autowired
////    public  Person(Parrot parrot) {
////        this.parrot = parrot;
////    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Parrot getParrot() {
//        return parrot;
//    }
//
//    @Autowired
//    public void setParrot(Parrot parrot) {
//        this.parrot = parrot;
//    }

}
