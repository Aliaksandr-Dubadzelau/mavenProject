import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstCrazyClass {

    private static final Logger logger = LoggerFactory.getLogger("main");

    public static void main(String[] args) {

        logger.info("Create SecondCrazyClass object.");
        SecondCrazyClass crazyClass = new SecondCrazyClass();

        logger.info("object.setAge(10)");
        crazyClass.setAge(10);
        logger.info("object.setName(Alex)");
        crazyClass.setName("Alex");
        logger.info("object.printHello()");
        crazyClass.printHello();
        logger.error("object.setAge(-1)");
        crazyClass.setAge(-1);
        System.out.println();
    }

}
