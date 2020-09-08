package Animal;

public class Person extends Animal implements CanRun{
    public static String type="mammal";

    @Override
    public void eatFood() {
        System.out.println("eat cooked food");
    }

    @Override
    public void run() {
        System.out.println("run by legs");
    }
}
