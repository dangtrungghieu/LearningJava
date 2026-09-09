package Source;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class RutThamTrungThuongSource_2 {
    private TreeSet<String> rutThamTrungThuong;
    //Constructor
    public RutThamTrungThuongSource_2() {
        this.rutThamTrungThuong = new TreeSet<String>();
    }
    //Get, set
    public TreeSet<String> getRutThamTrungThuong() {
        return this.rutThamTrungThuong;
    }

    public void setRutThamTrungThuong(TreeSet<String> rutThamTrungThuong) {
        this.rutThamTrungThuong = rutThamTrungThuong;
    }
    //Yeu cau 1: Them ma so du thuong
    public boolean add(String maSo){
        return this.rutThamTrungThuong.add(maSo);
    }
    //Yeu cau 2: Xoa ma so du thuong
    public boolean remove(String maSo){
        return this.rutThamTrungThuong.remove(maSo);
    }
    //Yeu cau 3: Kiem tra ma so co ton tai chua?
    public boolean checkExist(String maSo){
        return this.rutThamTrungThuong.contains(maSo);
    }
    //Yeu cau 4: Xoa tat ca phieu du thuong
    public void clear(){
        this.rutThamTrungThuong.clear();
    }
    //Yeu cau 5: Dem so luong phieu du thuong
    public int  size(){
        return this.rutThamTrungThuong.size();
    }
    //Yeu cau 6: Rut tham mot so bat ky
    public String rutTham(){
        Random random = new Random();
        int viTri = random.nextInt(this.rutThamTrungThuong.size());
        return (String) this.rutThamTrungThuong.toArray()[viTri];
    }
    //Yeu cau 7: In ra tat ca cac phieu hien co
    public void printAll(){
        System.out.println(Arrays.toString(this.rutThamTrungThuong.toArray()));
    }
}
