package Ex2.proxies;

import Ex2.model.Comment;

public class EmailCommentNotificationProxy implements CommnetNotificationProxy{

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: "
                + comment.getText());
    }
}
