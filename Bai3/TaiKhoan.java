package Bai3;
import java.text.DecimalFormat;
import java.util.Scanner;
public class TaiKhoan {
    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;
    private  String matKhau;
    DecimalFormat df = new DecimalFormat("#,###.##");
    Scanner scanner = new Scanner(System.in);
    public TaiKhoan( String chuTaiKhoan,String soTaiKhoan, double soDu , String matKhau) {
        this.chuTaiKhoan = chuTaiKhoan;
        this.soTaiKhoan = soTaiKhoan;
        this.soDu = soDu;
        this.matKhau = matKhau;
    }

    public String getchuTaiKhoan() {
        return chuTaiKhoan;
    }

    public void setchuTaiKhoan(String ChuTaiKhoan) {
        this.chuTaiKhoan = chuTaiKhoan;
    }
    public String getsoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setsoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }
    public double getsoDu() {
        return soDu;
    }
    public  void  setmatKhau( String matKhau ) {
        this.matKhau = matKhau ;
    }
    public   String getmatKhau( ){
        return this.matKhau ;
    }


    public void Rut(double rut) {
        if (rut > 0 && rut <= soDu){
            soDu -= rut;
            System.out.println("Ban da rut thanh cong, So Du Tai Khoan La: "+df.format(soDu)+" VNĐ");
        }

        else
            System.out.println("So tien rut khong hop le");
    }
    public void Gui(double gui) {
        if (gui > 0) {
            soDu += gui;
            System.out.println("Ban da nap thanh cong, So Du Tai Khoan La: " + df.format(soDu) + " VNĐ");

        }
    }
    public void doimatKhau (  ){
        System.out.println("Nhap mat khau hien tai: ");
        String matKhau = scanner.nextLine();
        if ( matKhau.equals(this.matKhau)){
            System.out.println("Nhap mat khau moi: ");
            String matKhauMoi = scanner.nextLine();
            this.matKhau = matKhauMoi;
            System.out.println("Doi mat khau thanh cong");
        }
        else
            System.out.println("Mat khau khong dung");
    }

        public void nhapThongTinTaiKhoan() {
            System.out.print("Nhap ten chu tai khoan: ");
            this.chuTaiKhoan = scanner.nextLine();
            System.out.print("Nhap so tai khoan: ");
            this.soTaiKhoan = scanner.nextLine();
            System.out.print("Nhap so du: ");
            this.soDu = scanner.nextDouble();
            scanner.nextLine();
            System.out.println(" Nhap mat khau");
            this.matKhau = scanner.nextLine();
        }
        // Method to print account details
        public void inThongTinTaiKhoan() {
            System.out.println("Ten Tai Khoan: " + this.chuTaiKhoan);
            System.out.println("So Tai Khoan: " + this.soTaiKhoan);
            System.out.println("So Du: " + df.format(this.soDu) + " VNĐ");
        }

    }


