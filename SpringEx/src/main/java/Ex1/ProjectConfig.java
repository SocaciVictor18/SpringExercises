package Ex1;

import Ex2.services.CommentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan(basePackages = "Ex1")
@ComponentScan(basePackages = {"Ex2.proxies", "Ex2.repository", "Ex2.services"})
public class ProjectConfig {
//
//    @Bean
//    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
//    public CommentService commentService() {
//        return new CommentService();
//    }
//    @Bean
//    public Parrot parrot1() {
//        Parrot p = new Parrot();
//        p.setName("Koko");
//        return p;
//    }
//
//    @Bean
//    public Parrot parrot2() {
//        Parrot p = new Parrot();
//        p.setName("Miki");
//        return p;
//    }
//    @Bean
//    public Parrot parrot1() {
//        Parrot p = new Parrot();
//        p.setName("Koko");
//        return p;
//    }
//
//    @Bean
//    public Parrot parrot2() {
//        Parrot p = new Parrot();
//        p.setName("Miki");
//        return p;
//    }
//
//    @Bean
//    public Person person(
//            @Qualifier("parrot2") Parrot parrot) {
//
//        Person p = new Person();
//        p.setName("Ella");
//        p.setParrot(parrot);
//        return p;
//    }

//
//    @Bean
//    public Parrot parrot1() {
//        Parrot p = new Parrot();
//        p.setName("Koko");
//        return p;
//    }
//
//    @Bean
//    public Parrot parrot2() {
//        Parrot p = new Parrot();
//        p.setName("Miki");
//        return p;
//    }
//
//    @Bean
//    public Person person(Parrot parrot2) {
//        Person p = new Person();
//        p.setName("Ella");
//        p.setParrot(parrot2);
//        return p;
//    }


//    @Bean
//    public Parrot parrot(){
//        Parrot parrot = new Parrot();
//        parrot.setName("Koko");
//        return parrot;
//    }
//
//    @Bean
//    public Person person(Parrot parrot){
//        Person p = new Person();
//        p.setName("Ella");
//        p.setParrot(parrot);
//        return p;
//    }


//    @Bean
//    public Person person() {
//        Person p = new Person();
//        p.setName("Ella");
//        p.setParrot(parrot());
//        return p;
//    }

//    @Bean
//    @Primary
//    Parrot parrot() {
//        var parrot = new Parrot();
//        parrot.setName("Koko");
//        return parrot;
//    }
//
//    @Bean
//    Parrot parrot2(){
//        var parrot = new Parrot();
//        parrot.setName("Miki");
//        return parrot;
//    }
//
//    @Bean
//    Parrot parrot3(){
//        var parrot = new Parrot();
//        parrot.setName("Riki");
//        return parrot;
//    }
//
//    @Bean
//    String hello(){
//        return "Hello";
//    }
//
//    @Bean
//    Integer ten(){
//        return 10;
//    }

}
