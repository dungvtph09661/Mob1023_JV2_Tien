package luyen_tap_1;

import java.util.ArrayList;

public interface QLDanhSachInterface {
    public void add(Nguoi n);
    public void edit(int viTri, Nguoi n);
    public void delete(int viTri);
    public Nguoi get(int viTri);
    public ArrayList<Nguoi> getList();
    public void setList(ArrayList<Nguoi> list);
}
