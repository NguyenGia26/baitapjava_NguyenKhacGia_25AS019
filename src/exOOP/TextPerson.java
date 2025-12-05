package exOOP;

import java.util.Scanner;

public class TextPerson {
    static void main(String[] args) {
    Person[] ds = new Person[5];
    ds[0]= new SinhVien("NguyenKhacGia","Tokyo",2007,"25AS019",9.0);
    ds[1]=new SinhVien("NguyenVAnTRI","PhoTranDUyHung",2007,"25AS018",2.0);
    ds[2]=new SinhVien("NguyenVAnA","PhoTranDUyHung",2007,"25AS017",3.0);
    ds[3]=new GiangVien("nguyenvanteo","vku", 1899,"GV1",1500000);
    ds[4]=new GiangVien("nguyenvanb","lamdong",1988,"GV2",1500.000);
        System.out.println("danhsach");
        String SinhVIen, GiangVien;
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap tim danh tin: ");
        String SinhVien = sc.next();
        System.out.println("SinhVien"+ds[]);x



    }
}
