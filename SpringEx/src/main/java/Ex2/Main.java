package Ex2;

import Ex1.ProjectConfig;
import Ex2.model.Comment;
import Ex2.proxies.EmailCommentNotificationProxy;
import Ex2.repository.DBCommentRepository;
import Ex2.services.CommentService;
import Ex2.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
//
//        var s1 = c.getBean(CommentService.class);
//        var s2 = c.getBean(UserService.class);
//
//        boolean b =
//        s1.getPrototypeRepository() == s2.getPrototypeRepository();
//
//        System.out.println(b);


//            var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
//
//            var cs1 = c.getBean("commentService", CommentService.class);
//            var cs2 = c.getBean("commentService", CommentService.class);
//
//            boolean b1 = cs1 == cs2;
//            System.out.println(b1);
//

//        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        System.out.println("Before retrieving the CommentService");
//        var service = context.getBean(CommentService.class);
//        System.out.println("After retrieving the CommentService");

//        var comment = new Comment();
//        comment.setAuthor("Victor");
//        comment.setText("Demo comment");
//
//        var commentService = context.getBean(CommentService.class);
//        commentService.publishComment(comment);

//        var commentRepository =
//                new DBCommentRepository();
//        var commentNotificationProxy =
//        new EmailCommentNotificationProxy();
//
//        var commentService =
//                new CommentService(
//                        commentRepository, commentNotificationProxy);
//
//        var comment = new Comment();
//        comment.setAuthor("Victor");
//        comment.setText("Demo comment");
//
//        commentService.publishComment(comment);
    }
}
