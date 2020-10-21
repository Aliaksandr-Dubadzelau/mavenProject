import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//log.log
public class FirstCrazyClass {

    private static final Logger logger = LoggerFactory.getLogger(FirstCrazyClass.class);

    public static void main(String[] args) {

        logger.info("Create Worker worker.");
        Worker crazyClass = new Worker();

        int wrongAge = -1;
        int age = 10;
        String name = "Alex";

        logger.info("object.setAge({})", age);
        crazyClass.setAge(age);
        logger.info("object.setName({})", name);
        crazyClass.setName(name);
        logger.info("object.printHello()");
        crazyClass.printHello();
        try {
            logger.info("object.setAge({})", wrongAge);
            crazyClass.setAge(wrongAge);
        }catch (Exception e){
            logger.error("Exception: {}", e.toString());
        }
    }

}
