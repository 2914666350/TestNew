package ExceptionPractice;

public class CircleException extends Throwable {
    @Override
    public String getMessage() {
       System.out.println("radius is negative");
        return null;
    }
}
