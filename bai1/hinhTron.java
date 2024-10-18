package bai1;

import java.util.Scanner;

public class hinhTron {
    private double banKinh;
    public hinhTron(double banKinh) {
        if (banKinh > 0) {
            this.banKinh = banKinh;
        } else {
            throw new IllegalArgumentException("Bán kính phải lớn hơn 0");
        }
    }
    public hinhTron() {
        this.banKinh = 1;
    }
    public double getBanKinh() {
        return banKinh;
    }
    public void setBanKinh(double banKinh) {
        if (banKinh > 0) {
            this.banKinh = banKinh;
        } else {
            throw new IllegalArgumentException("Bán kính phải lớn hơn 0");
        }
    }
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính của hình tròn: ");
        double banKinhMoi = scanner.nextDouble();
        setBanKinh(banKinhMoi);
    }
    public void inThongTin() {
        System.out.println("Thông tin hình tròn:");
        System.out.println("Bán kính: " + banKinh);
        System.out.println("Chu vi: " + tinhChuVi());
        System.out.println("Diện tích: " + tinhDienTich());
    }
}