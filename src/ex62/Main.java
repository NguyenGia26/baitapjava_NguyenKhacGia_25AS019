package ex62;
    public class Main {
        public static void main(String[] args) {
            // Tuyển dụng nhân viên (Đa hình)
            GeometricObject circle = new Circle(5.0);
            GeometricObject rect = new Rectangle(4.0, 6.0);

            // Kiểm tra nhân viên Circle
            System.out.println(circle);
            System.out.println("Diện tích tròn: " + circle.getArea());
            System.out.println("Chu vi tròn: " + circle.getPerimeter());

            System.out.println("--------------------");

            // Kiểm tra nhân viên Rectangle
            System.out.println(rect);
            System.out.println("Diện tích HCN: " + rect.getArea());
            System.out.println("Chu vi HCN: " + rect.getPerimeter());
        }
    }
