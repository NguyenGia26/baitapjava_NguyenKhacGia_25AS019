package exOOP;

public class SinhVien extends Person{
    private String maSV;
    private double diemTB;

    public SinhVien(String hoTen, String diaChi, int namSinh, String maSV, double diemTB) {
        super(hoTen, diaChi, namSinh);
        this.maSV = maSV;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }
    public double getDiemTB() {
        return diemTB;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String getLoai() {
        return "SinhVIen";
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("maSinhVien"+getMaSV());
        System.out.println("DiemTrungBInh"+getDiemTB());
    }
}
