package PTBac2;

import java.util.Scanner;

public class KiemTra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập giá trị
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();

        //
        PhuongTrinhBac2 ptb2 = new PhuongTrinhBac2(a, b, c);
        ptb2.kiemTra();
    }
}
