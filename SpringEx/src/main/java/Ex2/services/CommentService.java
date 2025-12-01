package Ex2.services;

import Ex2.model.Comment;
import Ex2.proxies.CommentNotificationProxy;
import Ex2.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
//    private final CommentRepository commentRepository;
//    private final CommnetNotificationProxy notificationProxy;
//
////    @Autowired is optional because we have one constructor
//    public CommentService(CommentRepository commentRepository, CommnetNotificationProxy notificationProxy) {
//        this.commentRepository = commentRepository;
//        this.notificationProxy = notificationProxy;
//    }
    private final CommentRepository commentRepository;

    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(
            CommentRepository commentRepository,
            @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {

        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
