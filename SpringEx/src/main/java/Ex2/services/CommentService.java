package Ex2.services;

import Ex2.model.Comment;
import Ex2.proxies.CommnetNotificationProxy;
import Ex2.repository.CommentRepository;

public class CommentService {
    private final CommentRepository commentRepository;
    private final CommnetNotificationProxy notificationProxy;

    public CommentService(CommentRepository commentRepository, CommnetNotificationProxy notificationProxy) {
        this.commentRepository = commentRepository;
        this.notificationProxy = notificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        notificationProxy.sendComment(comment);
    }
}
