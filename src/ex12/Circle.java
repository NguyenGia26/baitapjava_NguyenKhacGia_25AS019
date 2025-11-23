package ex12;

public class Circle {
    private double radius = 1.0 ;


    public Circle() {

    }
     public Circle(double r) {
        this.radius = r ;
    }
     public double Getradius(){
        return radius;
    }
     public void setRadius(double radius) {
        this.radius = radius;
     }
     public double getArea() {
        return Math.PI * radius  * radius;
    }
     public double getCircumference() {
        return 2 * radius * Math.PI ;
     }
 public String ToString () {
     return "Cricle[radius= " + radius + "]" ;
 }
}