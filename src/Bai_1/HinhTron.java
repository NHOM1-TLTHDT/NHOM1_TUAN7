package Bai_1;

public class HinhTron {
    private double banKinh;
    public HinhTron(){

    }
    public double getBanKinh(){
        return this.banKinh;
    }
    public void setBanKinh(double banKinh){
        if(banKinh > 0){
            this.banKinh=banKinh;
        }
        else{
            System.out.println("Loi nhap du lieu");
        }
    }
    public double chuVi(){
        return 2*Math.PI*this.banKinh;
    }
    public double dienTich(){
        return Math.PI*this.banKinh*this.banKinh;
    }
}
