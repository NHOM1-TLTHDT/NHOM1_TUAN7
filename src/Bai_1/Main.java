package Bai_1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;
        HinhTron ht = new HinhTron();
        do {
            System.out.print("Nhap ban kinh: ");
            double r = sc.nextDouble();
            ht.setBanKinh(r);
            System.out.println("Chon phep tinh: 1. Tinh chu vi || 2. Tinh dien tich||3. Thoat");
            System.out.print("Lua chon: ");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("Chu vi Hinh Tron la: " + ht.chuVi());
                    break;
                case 2:
                    System.out.println("Dien tich Hinh Tron la: " + ht.dienTich());
                    break;
                case 3:
                    System.out.println("Cam on da dung chuong trinh");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (luaChon != 3);
    }
}
