package Ex2.services;

import Ex2.repository.CommentRepository;
import Ex2.repository.PrototypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private PrototypeRepository prototypeRepository;

    public PrototypeRepository getPrototypeRepository() {
        return prototypeRepository;
    }
}
