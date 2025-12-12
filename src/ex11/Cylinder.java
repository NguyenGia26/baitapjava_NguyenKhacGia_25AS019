package ex11;

public class Cylinder {
    private Circle day;
    private Double height;

    public Cylinder(Circle day, Double height) {
        this.day = day;
        this.height = height;
    }

    public Circle getDay() {
        return day;
    }

    public void setDay(Circle day) {
        this.day = day;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "day=" + day +
                ", height=" + height +
                '}';
    }
}
