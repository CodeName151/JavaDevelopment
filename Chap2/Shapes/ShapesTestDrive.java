package Chap2.Shapes;
import java.util.*;
public class ShapesTestDrive{
    public static void main(String[] args) {
        int random = (int) (Math.random()*100);
System.out.println(random);
        if(random < 100 && random > 75){
            Circle circle = new Circle();
            circle.rotate();
            circle.playSound();
        }
       else if(random < 75 && random > 50){
            Rectangle rectangle = new Rectangle();
            rectangle.rotate();
            rectangle.playSound();
        }
       else if(random < 50 && random >= 25){
            Triangle triangle = new Triangle();
            triangle.rotate();
            triangle.playSound();
        }
        else if(random < 25 && random >= 0){
            Ambeo ambeo = new Ambeo();
            ambeo.rotate();
            ambeo.playSound();
        }
    }

}