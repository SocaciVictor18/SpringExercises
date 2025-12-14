package Ex2.services;

import Ex2.model.Comment;
import Ex2.model.CommentProcessor;
import Ex2.proxies.CommentNotificationProxy;
import Ex2.repository.CommentRepository;
import Ex2.repository.PrototypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
//@Lazy
public class CommentService {

    @Autowired
    private ApplicationContext context;

    @Autowired
    private PrototypeRepository prototypeRepository;

    public PrototypeRepository getPrototypeRepository() {
        return prototypeRepository;
    }

    public void sendComment(Comment c) {
        CommentProcessor p =
                context.getBean(CommentProcessor.class);

        p.setComment(c);
        p.processComment(c);
        p.validateComment(c);

        c = p.getComment();
        // do something further
    }
//    private final CommentRepository commentRepository;
//    private final CommnetNotificationProxy notificationProxy;
//
////    @Autowired is optional because we have one constructor
//    public CommentService(CommentRepository commentRepository, CommnetNotificationProxy notificationProxy) {
//        this.commentRepository = commentRepository;
//        this.notificationProxy = notificationProxy;
//    }
//    private final CommentRepository commentRepository;
//
//    private final CommentNotificationProxy commentNotificationProxy;
//
//    public CommentService(
//            CommentRepository commentRepository,
//            @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
//
//        this.commentRepository = commentRepository;
//        this.commentNotificationProxy = commentNotificationProxy;
//        System.out.println("Service created");
//    }
//
//    public void publishComment(Comment comment) {
//        commentRepository.storeComment(comment);
//        commentNotificationProxy.sendComment(comment);
//    }
}
