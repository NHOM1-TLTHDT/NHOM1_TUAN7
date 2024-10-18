package bài2;

import java.util.Scanner;

public class sinhvien {
    private String masv;
    private String ten;
    private String ngsinh;
    private double diemtb;
    private String hocluc;

    public sinhvien(String masv, String ten, String ngsinh, double diemtb, String hocluc) {
        this.masv = masv;
        this.ten = ten;
        this.ngsinh = ngsinh;
        this.diemtb = diemtb;
        this.hocluc = hocluc;
    }
    public sinhvien() {
    }
    public void inthongtin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ma sinh vien");
        this.masv=sc.nextLine();
        System.out.println("nhap ten");
        this.ten=sc.nextLine();
        System.out.println("nhap ngay sinh");
        this.ngsinh =sc.nextLine();
        System.out.println("nhap diem trung binh");
        this.diemtb=sc.nextDouble();
    }
public String xeploai(double diemtb){
        if(diemtb>8)
           return "gioi";
        else if(diemtb>7)
            return "kha";
        else if(diemtb>5.5)
            return "trung binh";
             else
                 return "yeu";
}
public void inhocluc(){
        this.hocluc=xeploai(diemtb);
    System.out.println("xep loai"+this.hocluc);
}
}
