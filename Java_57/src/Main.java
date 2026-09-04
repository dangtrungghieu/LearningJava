import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale lc = new Locale("vi", "VN");
        NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
        double bankEmployer = 50000000;
        //System.out.println(nf.format(bankEmployer));
        //Source
        Scanner sc = new Scanner(System.in);
        int n = 1;
        do{
            System.out.println("-----TRO CHOI TAI XIU AN TIEN-----");
            System.out.println("***Bat dau choi (Chon 1)");
            System.out.println("***Thoat (Chon so bat ky)");
            System.out.println("Nhap lua chon cua ban: ");
            //Xu ly nhap khong hop le
            try {
                n = sc.nextInt();
                System.out.println("Loading.....");
            }catch (Exception e){
                System.out.println("Lua chon khong hop le! Moi ban nhap lai!");
                sc.nextLine();
            }

            if(n == 1){
                //Dat cuoc
                System.out.println("Ban hien co: " + nf.format(bankEmployer));
                int soTienCuoc;
                while(true){
                    System.out.println("Ban muon dat cuoc bao nhieu: ");
                    try {
                        soTienCuoc = sc.nextInt();
                        if(soTienCuoc < 0 || soTienCuoc > bankEmployer){
                            System.out.println("So tien khong hop le!");
                            continue;
                        }
                        sc.nextLine();
                        break;
                    }catch (Exception e){
                        System.out.println("So tien khong hop le!");
                        sc.nextLine();
                    }
                }
                //Chon tai hay xiu
                int choice;
                while(true){
                    System.out.println("Ban chon TAI hay XIU: ");
                    System.out.println("Chon TAI (Nhap so 1)");
                    System.out.println("Chon XIU (Nhap so 2)");
                    try {
                        choice = sc.nextInt();
                        if (choice != 1 && choice != 2){
                            System.out.println("Lua chon khong hop le!");
                            continue;
                        }
                        sc.nextLine();
                        break;
                    }catch (Exception e){
                        System.out.println("Lua chon khong hop le!");
                        sc.nextLine();
                    }
                }
                //Tung xuc xac
                Random xucxac = new Random();
                int lan1 = xucxac.nextInt(5) + 1;
                int lan2 = xucxac.nextInt(5) + 1;
                int lan3 = xucxac.nextInt(5) + 1;
                int result = lan1 + lan2 + lan3;
                System.out.println("Ket qua: ");
                System.out.println("Lan 1: " + lan1);
                System.out.println("Lan 2: " + lan2);
                System.out.println("Lan 3: " + lan3);
                System.out.println("Tong diem la: " + result);
                if(result == 3 || result == 18){
                    System.out.println("Nha cai an het!");
                    System.out.println("Ban bi tru: " + nf.format(soTienCuoc));
                    bankEmployer = bankEmployer - soTienCuoc;
                    System.out.println("Ban hien co: " + nf.format(bankEmployer));
                }
                //Logic
                if(choice == 2){
                    if (result >= 4 && result <= 10){
                        System.out.println("Ban thang!");
                        System.out.println("Ban duoc cong them: " + nf.format(soTienCuoc));
                        bankEmployer = bankEmployer + soTienCuoc;
                        System.out.println("Ban hien co: " + nf.format(bankEmployer));
                    }else {
                        System.out.println("Ban thua!");
                        System.out.println("Ban bi tru: " + nf.format(soTienCuoc));
                        bankEmployer = bankEmployer - soTienCuoc;
                        System.out.println("Ban hien co: " + nf.format(bankEmployer));
                    }
                }else {
                    if (result >= 11 && result <= 17) {
                        System.out.println("Ban thang!");
                        System.out.println("Ban duoc cong them: " + nf.format(soTienCuoc));
                        bankEmployer = bankEmployer + soTienCuoc;
                        System.out.println("Ban hien co: " + nf.format(bankEmployer));
                    } else {
                        System.out.println("Ban thua!");
                        System.out.println("Ban bi tru: " + nf.format(soTienCuoc));
                        bankEmployer = bankEmployer - soTienCuoc;
                        System.out.println("Ban hien co: " + nf.format(bankEmployer));
                    }
                }
            }
        }while(n == 1);
    }
}
