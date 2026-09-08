package Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSachSV;

    //Constructor empty (tao danh sach rong)
    public DanhSachSinhVien() {
        this.danhSachSV = new ArrayList<SinhVien>();
    }

    //Constructor (lay du lieu tu danh sach truyen vao)
    public DanhSachSinhVien(ArrayList<SinhVien> danhSachSV) {
        this.danhSachSV = danhSachSV;
    }
    //Generate get, set
    public ArrayList<SinhVien> getDanhSachSV() {
        return danhSachSV;
    }

    public void setDanhSachSV(ArrayList<SinhVien> danhSachSV) {
        this.danhSachSV = danhSachSV;
    }

    //Yeu cau 1: Them moi sinh vien
    public void Add(SinhVien sv){
        this.danhSachSV.add(sv);
    }
    //Yeu cau 2: In toan bo danh sach sinh vien
    public void PrintAll(){
        for(SinhVien i : this.danhSachSV){
            System.out.println(i.toString());
        }
    }
    //Yeu cau 3: Kiem tra danh sach sinh vien co rong khong?
    public boolean CheckEmptyList(){
        return  this.danhSachSV.isEmpty();
    }
    //Yeu cau 4: Dem so luong sinh vien hien co
    public int CountList(){
        return this.danhSachSV.size();
    }
    //Yeu cau 5: Reset danh sach
    public void ListForEmpty(){
        this.danhSachSV.clear();
    }
    //Yeu cau 6: Kiem tra sinh vien da ton tai chua (dua vao maSV)
//    public boolean CheckExist(String maSV){
//        for(SinhVien i : this.danhSachSV){
//            if(i.getMaSV().equals(maSV)){
//                return true;
//            }
//        }
//        return false;
//    }
    public boolean CheckExist(SinhVien sv){
        return  this.danhSachSV.contains(sv);
    }
    //Yeu cau 7: Xoa sinh vien (nhap vao maSV)
    public void Delete(SinhVien sv){
        this.danhSachSV.remove(sv);
    }
    //Yeu cau 8: Tim kiem sinh vien theo Ho va Ten
    public void Search(String hoTen){
        for(SinhVien i : this.danhSachSV){
            if(i.getHoVaTen().contains(hoTen)){
                System.out.println(i.toString());
            }
        }
    }
    //yeu cau 9: In danh sach sap xep theo thu tu diemTB giam dan
    public void sapXepGiamDan(){
        Collections.sort(this.danhSachSV, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getDiemTB() < o2.getDiemTB()){
                    return 1;
                }else if(o1.getDiemTB() > o2.getDiemTB()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }

}
