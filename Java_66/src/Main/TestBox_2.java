package Main;

public class TestBox_2 {
    public static void main(String[] args) {
        Box_2 box = new Box_2<Integer>(5);
        System.out.println("Value: " + box.getValue());
        Box_2 box2 = new Box_2<String>("Dang Trung Hieu");
        System.out.println("Value: " + box2.getValue());
    }
}
