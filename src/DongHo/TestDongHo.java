package DongHo;

import java.util.Random;

public class TestDongHo {
    public static void main(String[] args) {

        // tạo mảng ngẫu nhiên (10 phần tử)
        int arr[] = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000); // lấy giá trị ngẫu nhiên từ 0 đến 999
        }

        // in ra mảng trước khi sắp xếp
        System.out.println("Mảng ban đầu:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // chạy đồng hồ
        DongHoBamGio dongHo = new DongHoBamGio();
        dongHo.BatDau();

        // sắp xếp mảng theo thứ tự tăng dần
        for (int i = 0; i < arr.length -1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        dongHo.KetThuc(); // kết thúc

        // in ra mảng sau khi sắp xếp
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // in ra kết quả cuối cùng: đồng hồ đo thời gian thực hiện sắp xếp mảng
        System.out.println();
        System.out.println("Thời gian thực thi: " + dongHo.getThoiGianTroiQua() + "ms");
    }
}
