package Ex2;

import Ex1.ProjectConfig;
import Ex2.model.Comment;
import Ex2.proxies.EmailCommentNotificationProxy;
import Ex2.repository.DBCommentRepository;
import Ex2.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var comment = new Comment();
        comment.setAuthor("Victor");
        comment.setText("Demo comment");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);

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
