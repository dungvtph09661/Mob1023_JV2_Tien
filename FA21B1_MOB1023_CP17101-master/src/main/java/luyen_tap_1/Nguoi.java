package luyen_tap_1;

import java.io.Serializable;

public class Nguoi implements Serializable {
    private String hoTen, queQuan, diaChi;
    private int gioiTinh;
    
    public String xuatThongTin() {
        String info = this.hoTen + " - " +
            this.gioiTinh + " - " +
            this.diaChi + " - " +
            this.queQuan;
        
        return info;
    }

    public Nguoi() {
    }

    public Nguoi(String hoTen, String queQuan, String diaChi, int gioiTinh) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
}
