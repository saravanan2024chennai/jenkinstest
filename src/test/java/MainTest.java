
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.stackroute.Main;

public class MainTest {
    Logger logger= LoggerFactory.getLogger(MainTest.class);
 Main greet;
    @BeforeEach
    void setUp() throws Exception {
        greet = new Main();
    }

    @AfterEach
    void tearDown() throws Exception {
        greet = null;
    }

    @Test
    void test() {
        logger.info("inside test method");
        String msg = "Have a Happy & Healthy Day";
        String result = greet.message();
        assertEquals(msg, result);
    }
}
