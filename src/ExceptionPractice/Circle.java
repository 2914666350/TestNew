package ExceptionPractice;
import java.lang.Math;
import java.util.Scanner;

public class Circle {
    private double radius;
    private final double PI;
    public Circle(double radius) { this.radius = radius;PI = Math.PI; }
    public void setRadius(double r){
        try {
            if (r<0) { throw new CircleException(); }
            else{ this.radius=r; }
        }catch (CircleException e){ e.printStackTrace(); }
    }
    public double area(){
        return PI*this.radius*this.radius;
    }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         double r=sc.nextDouble();
         try {
           if(r<0){ throw new CircleException(); }
           else {
               Circle circle=new Circle(r);
               System.out.println("面积是"+circle.area()); }
         }catch (CircleException e) {
             e.printStackTrace();
         }
     }
}
