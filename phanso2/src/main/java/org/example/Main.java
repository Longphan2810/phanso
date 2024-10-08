package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập phân số thứ nhất
        System.out.println("Nhập tử số của phân số thứ nhất: ");
        int tu1 = scanner.nextInt();
        System.out.println("Nhập mẫu số của phân số thứ nhất: ");
        int mau1 = scanner.nextInt();
        PhanSo phanSo1 = new PhanSo(tu1, mau1);

        // Nhập phân số thứ hai
        System.out.println("Nhập tử số của phân số thứ hai: ");
        int tu2 = scanner.nextInt();
        System.out.println("Nhập mẫu số của phân số thứ hai: ");
        int mau2 = scanner.nextInt();
        PhanSo phanSo2 = new PhanSo(tu2, mau2);

        // Tính tổng hai phân số
        PhanSo tong = PhanSoUtils.congPhanSo(phanSo1, phanSo2);

        // Hiển thị kết quả
        System.out.println("Tổng của hai phân số là: " + tong.toString());

        scanner.close();
    }
}
