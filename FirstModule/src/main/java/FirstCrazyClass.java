import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//log.log
public class FirstCrazyClass {

    private static final Logger logger = LoggerFactory.getLogger(FirstCrazyClass.class);
    private static final int TEST_WRONG_AGE = -1;
    private static final int TEST_AGE = 10;
    private static final String TEST_NAME = "Alex";

    public static void main(String[] args) {

        logger.info("Create Worker worker.");
        Worker crazyClass = new Worker();

        logger.info("object.setAge({})", TEST_AGE);
        crazyClass.setAge(TEST_AGE);
        logger.info("object.setName({})", TEST_NAME);
        crazyClass.setName(TEST_NAME);
        logger.info("object.printHello()");
        crazyClass.printHello();
        try {
            logger.info("object.setAge({})", TEST_WRONG_AGE);
            crazyClass.setAge(TEST_WRONG_AGE);
        }catch (Exception e){
            logger.error("Exception: {}", e.toString());
        }
    }

}
