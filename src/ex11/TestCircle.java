package ex11;

import java.util.Objects;
import java.util.Scanner;

public class TestCircle {  // Save as "TestCircle.java"
    public static void main(String[] args) {
        // Declare an instance of Circle class called c1.
        // Construct the instance c1 by invoking the "default" constructor
        // which sets its radius and color to their default value.
        Scanner sc = new Scanner(System.in);
        String role = "admin";

        Circle c1 = new Circle();
        if (Objects.equals(role, "admin")) {
            c1.setColor("blue");
        } else if (Objects.equals(role, "user")) {
            c1.setColor("orange");
        }

        // Invoke public methods on instance c1, via dot operator.
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea() + c1.getColor());
        //The circle has radius of 1.0 and area of 3.141592653589793

        // Declare an instance of class circle called c2.
        // Construct the instance c2 by invoking the second constructor
        // with the given radius and default color.
        Circle c2 = new Circle(2.0);
        // Invoke public methods on instance c2, via dot operator.
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea() + c2.getColor());
        //The circle has radius of 2.0 and area of 12.566370614359172

        Cylinder cylinder = new Cylinder(c2, 3.7);
        System.out.println(cylinder.getDay().getColor());


        int sotrudien = 160;

        if (sotrudien < 50) {
            System.out.println(sotrudien * 1000);
        } else {
            int sodu = sotrudien - 50;
            System.out.println(sodu * 1200 + 50 * 1000);
            int sosau100 = sotrudien - 100;
            if (sotrudien > 100) {
                System.out.println(sotrudien);
                System.out.println(sodu);
                System.out.println(sosau100);
                System.out.println(50 * 1000 + 50 * 1200 + sosau100 * 1400);//*1400
            } else if (sotrudien > 150) {
                int sosau150 = sotrudien - 150;
                System.out.println(sotrudien);
                System.out.println(sodu);
                System.out.println(sosau100);
                System.out.println(sosau150);
                System.out.println(50 * 1000 + 50 * 1200 + 50 * 1400 + sosau150 * 2000);
            }

        }

    }


}

