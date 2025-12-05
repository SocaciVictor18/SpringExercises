package Ex3.services;

import Ex3.aspects.ToLog;
import Ex3.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger
            = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        logger.info("Publishing comment:" + comment.getText());
    }

    @ToLog
    public void deleteComment(Comment comment) {
        logger.info("Deleting comment:" + comment.getText());
    }

    public void editComment(Comment comment) {
        logger.info("Editing comment:" + comment.getText());
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
//    public void publishComment(Comment comment) {
//        logger.info("Publishing comment: " + comment.getText());
//    }

//    public String publishComment(Comment comment) {
//        logger.info("Publishing comment:" + comment.getText());
//        return "SUCCESS";
//    }
}
