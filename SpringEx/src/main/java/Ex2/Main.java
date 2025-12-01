package Ex2;

import Ex2.model.Comment;
import Ex2.proxies.EmailCommentNotificationProxy;
import Ex2.repository.DBCommentRepository;
import Ex2.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository =
                new DBCommentRepository();
        var commentNotificationProxy =
        new EmailCommentNotificationProxy();

        var commentService =
                new CommentService(
                        commentRepository, commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("Victor");
        comment.setText("Demo comment");

        commentService.publishComment(comment);
    }
}
