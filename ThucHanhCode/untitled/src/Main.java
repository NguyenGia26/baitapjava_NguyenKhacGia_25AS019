class Calculator {
    // 1. Cùng tên "add"
    int add(int a, int b) {
        return a + b;
    }

    // 2. Cùng tên "add" nhưng khác kiểu tham số
    double add(double a, double b) {
        return a + b;
    }

    // 3. Cùng tên "add" nhưng khác số lượng tham số
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Khi em gọi:
Calculator calc = new Calculator();
calc.add(5, 10);      // Compiler biết ngay đây là hàm số 1
calc.add(5.5, 10.1);  // Compiler biết ngay đây là hàm số 2

void main() {
}