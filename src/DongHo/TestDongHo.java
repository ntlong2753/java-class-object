package DongHo;

import java.util.Random;

public class TestDongHo {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);
        }
        System.out.println("Mảng ban đầu:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        DongHoBamGio dongHo = new DongHoBamGio();
        dongHo.BatDau();
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
        dongHo.KetThuc();

        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Thời gian thực thi: " + dongHo.getThoiGianTroiQua() + "ms");
    }
}
