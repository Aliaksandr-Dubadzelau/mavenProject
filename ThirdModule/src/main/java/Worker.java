import java.util.Objects;

public class Worker {

    private static final int MIN_AGE = 0;

    private String name;
    private int age;


    public Worker() {
    }

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < MIN_AGE) {
            throw new IllegalArgumentException("Age must be more then 0");
        }

        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker that = (Worker) o;
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
        System.out.println("Hello " + this);
    }
}