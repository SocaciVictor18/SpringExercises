package Ex2.repository;

import Ex2.model.Comment;

public class DBCommentRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment in DB: " + comment.getText());
    }
}
