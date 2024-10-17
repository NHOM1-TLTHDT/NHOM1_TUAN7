package Bai3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaiKhoan tk = new TaiKhoan("", "", 0 , "");
        tk.nhapThongTinTaiKhoan();
        tk.inThongTinTaiKhoan();


        // Nhập và chọn loại giao dịch
        System.out.println("Chon 1 de gui tien");
        System.out.println("Chon 2 de rut tien");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Nhap so tien muon gui: ");
                double soTienGui = sc.nextDouble();
                tk.Gui(soTienGui);
                break;
            case 2:
                System.out.print("Nhap so tien muon rut: ");
                double soTienRut = sc.nextDouble();
                tk.Rut(soTienRut);
                break;
            case 3 :
                System.out.println( "doi mat khau");
                tk.doimatKhau();
            default:
                System.out.println("Chon sai. Moi ban chon lai.");
                return;
        }

        // In lại thông tin tài khoản sau khi giao dịch
        tk.inThongTinTaiKhoan();
        tk.doimatKhau();
    }
}
