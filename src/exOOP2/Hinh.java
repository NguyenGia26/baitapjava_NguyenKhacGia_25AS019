package exOOP2;

public abstract class Hinh implements IHinhHoc{
    private String tenHinh(){
        return "";
    };

    public Hinh() {
    }
    public class getertenHinh {};
    public void xuatThongTin(){
        System.out.println("Hinh :.."+tenHinh());
        System.out.println("Chu vi = ...."+tinhChuVi());
        System.out.println("Dien Tich=..."+tinhDienTich());
    }
}
