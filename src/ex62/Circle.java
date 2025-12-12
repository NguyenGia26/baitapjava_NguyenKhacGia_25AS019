package ex62;
public class Circle implements GeometricObject {
    private double radius;

    // Hàm khởi tạo (Constructor)
    public Circle(double radius) {
        this.radius = radius;
    }

    // --- Bắt đầu thực hiện hợp đồng (Override) ---

    @Override
    public double getArea() {
        return Math.PI * radius * radius; // Công thức: Pi * r^2
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;      // Công thức: 2 * Pi * r
    }

    // --- Các hàm khác ---

    @Override
    public String toString() {
        // Yêu cầu trong ảnh: "Circle[radius=r]"
        return "Circle[radius=" + radius + "]";
    }

}


