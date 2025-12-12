package ex62;

public class Rectangle implements GeometricObject {
    private double width;
    private double length;

    // Hàm khởi tạo
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // --- Bắt đầu thực hiện hợp đồng (Override) ---

    @Override
    public double getArea() {
        return width * length; // Dài nhân rộng
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length); // (Dài + Rộng) nhân 2
    }

    // --- Các hàm khác ---

    @Override
    public String toString() {
        // Yêu cầu trong ảnh: "Rectangle[width=?,length=?]"
        return "Rectangle[width=" + width + ",length=" + length + "]";
    }
}