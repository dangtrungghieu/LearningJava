public class Main {
    public static void main(String[] args) {
        ToaDo toaDo1 = new ToaDo(1,5);
        ToaDo toaDo2 = new ToaDo(2,6);
        ToaDo toaDo3 = new ToaDo(3,8);
        ToaDo toaDo4 = new ToaDo(4,7);

//        Hinh hinh = new Hinh(toaDo1); => Error
        Hinh hinh1 = new HinhTron(toaDo1,3);
        Hinh hinh2 = new HinhChuNhat(toaDo2,5,8);

        System.out.println(hinh1.tinhDienTich());
        System.out.println(hinh2.tinhDienTich());
    }
}
