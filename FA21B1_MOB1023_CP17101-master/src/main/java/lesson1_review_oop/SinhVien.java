package lesson1_review_oop;

public class SinhVien extends Person
{
    /*
     * Class con sẽ được kế thừa những thuộc tính & phương thức KHÔNG PRIVATE của Class cha.
     * Đối tượng của class con cũng có kiểu của class cha.
     */

    private String maSV;
    private int soTienTrongVi;

    public SinhVien() {
    }

    public SinhVien(String maSV, int soTienTrongVi, String name, int age, String cccd) {
        super(name, age, cccd);
        this.maSV = maSV;
        this.soTienTrongVi = soTienTrongVi;
    }
    
    public String getMaSV() {
        return this.maSV;
    }
    
    public void napTien(int soTien) {
        this.soTienTrongVi += soTien;
    }
    
    public void tieuTien(int soTien) {
        this.soTienTrongVi -= soTien;
    }
    
    @Override
    public String getThongTin() {
        String info = super.getThongTin() + " - " + this.maSV + " - " + this.soTienTrongVi;
        return info;
    }
    
    public String getThongTin(String chuyenNganh) {
        return this.maSV + " - " + chuyenNganh + " - " + this.soTienTrongVi;
    }
}
