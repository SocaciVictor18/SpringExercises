package Chapter2;

import Ex1.Parrot;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import Ex1.ProjectConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ProjectConfig.class})
public class AppTests {

    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("Test that a Parrot instance " +
            "with the attribute name having the value Koko " +
            "has been added to the Spring context.")
    public void testKokoIsInTheSpringContext() {
        Parrot p = context.getBean(Parrot.class);

        assertEquals("Koko", p.getName());
    }
}
