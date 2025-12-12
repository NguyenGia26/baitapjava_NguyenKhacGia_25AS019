package exOOP2;

public class HinhChuNhat extends Hinh{
    private double chieuDai;
    private double chieuRong;
    public HinhChuNhat (double chieuDai,double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong= chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    @Override
    public double tinhChuVi() {
        return (chieuDai+chieuRong)*2;
    }

    @Override
    public double tinhDienTich() {
        return chieuDai*chieuRong;
    }
}
