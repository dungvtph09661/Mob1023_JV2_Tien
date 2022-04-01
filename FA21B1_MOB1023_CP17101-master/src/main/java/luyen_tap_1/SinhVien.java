package luyen_tap_1;

public class SinhVien extends Nguoi {
    private String maSV;
    private String chuyenNganh;
    
    @Override
    public String xuatThongTin() {
        String basicInfo = super.xuatThongTin();
        return basicInfo + " - " + this.maSV + " - " + this.chuyenNganh;
    }

    public SinhVien() {
    }

    public SinhVien(String maSV, String chuyenNganh, String hoTen, String queQuan, String diaChi, int gioiTinh) {
        super(hoTen, queQuan, diaChi, gioiTinh);
        this.maSV = maSV;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    
    
}
