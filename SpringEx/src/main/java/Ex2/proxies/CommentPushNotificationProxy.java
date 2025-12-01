package Ex2.proxies;

import Ex2.model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CommentPushNotificationProxy implements CommnetNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment: " + comment.getText());
    }
}
