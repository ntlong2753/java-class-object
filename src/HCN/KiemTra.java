package HCN;

import java.util.Scanner;

public class KiemTra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều dài = ");
        double chieuDai = sc.nextDouble();

        System.out.print("Nhập chiều rộng = ");
        double chieuRong = sc.nextDouble();

        HinhChuNhat hcn = new HinhChuNhat(chieuDai, chieuRong);
        hcn.hienThi();
    }
}
