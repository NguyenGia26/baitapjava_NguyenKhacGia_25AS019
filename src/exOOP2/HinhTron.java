package exOOP2;

public class HinhTron extends Hinh{
    private double banKinh;
    public HinhTron(double banKinh){
        this.banKinh=banKinh;
    }
    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
}
