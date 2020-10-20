import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class SecondCrazyClass {

    private static final int MIN_AGE = 0;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private String name;
    private int age;


    public SecondCrazyClass() {
        logger.info("Create object");
    }

    public SecondCrazyClass(String name, int age) {
        logger.info("Create object with parameters ({}, {})", name, age);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        logger.info("method setName({})", name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        logger.info("method setAge({})", age);
        if(age < MIN_AGE) {
            logger.error("", new IllegalArgumentException("Age must be more then 0"));
            throw new IllegalArgumentException("Age must be more then 0");
        }

        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecondCrazyClass that = (SecondCrazyClass) o;
        return getAge() == that.getAge() &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return "My name:" + name + ". I am " + age + "years old.";
    }

    public void printHello(){
        logger.info("Method printHello(): Hello {}", this);
        System.out.println("Hello " + this);
    }
}
