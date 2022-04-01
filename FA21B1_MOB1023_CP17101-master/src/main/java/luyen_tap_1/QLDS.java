package luyen_tap_1;

import java.util.ArrayList;

public class QLDS implements QLDanhSachInterface {
    private ArrayList<Nguoi> list;
    
    public QLDS() {
        this.list = new ArrayList<>();
    }
    
    public QLDS(ArrayList<Nguoi> list) {
        this.list = list;
    }
//    
//    public void taoDoiTuongAo() throws Exception {
//        try {
//            // Code ...
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw e;
//        }
//    }

    @Override
    public void add(Nguoi nguoi) {
        this.list.add(nguoi);
    }

    @Override
    public void edit(int viTri, Nguoi nguoi) {
        this.list.set(viTri, nguoi);
    }

    @Override
    public void delete(int viTri) {
        this.list.remove(viTri);
    }

    @Override
    public Nguoi get(int viTri) {
        return this.list.get(viTri);
    }

    @Override
    public ArrayList<Nguoi> getList() {
        return this.list;
    }

    @Override
    public void setList(ArrayList<Nguoi> list) {
        this.list = list;
    }
    
}
