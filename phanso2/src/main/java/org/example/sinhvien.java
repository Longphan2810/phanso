/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.util.Scanner;

/**
 *
 * @author Thinkpad E440
 */
public class sinhvien {

    private String ten;
    private String email;
    private String sdt;
    private String cccd;

    public sinhvien() {

    }

    public sinhvien(String ten, String email, String sdt, String cccd) {

        this.ten = ten;
        this.email = email;
        this.sdt = sdt;
        this.cccd = cccd;
    }

    public String getTen() {
        return ten;
    }

    public String getEmail() {
        return email;
    }

    public String getSdt() {
        return sdt;
    }

    public String getCccd() {
        return cccd;
    }

    public void setTen(String tenmoi) {
        this.ten = tenmoi;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public void nhap() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien :");
        this.ten = sc.nextLine();
        do {
            System.out.println("Nhap email : ");
            String em = sc.nextLine();
            String quatter = "\\w+@\\w+\\.\\w{2,3}";
            if (em.matches(quatter)) {
                this.email = em;
                break;
            } else {
                System.out.println("Vui lòng Nhập đúng định dạng email ");

            }

        } while (true);

        do {
            System.out.println("Nhap sdt : ");
            String sdtm = sc.nextLine();
            String checksdt = "0+\\d{9}";
            if (sdtm.matches(checksdt)) {
                this.sdt = sdtm;
                break;
            } else {

                System.out.println("Vui long nhap sdt theo dinh danh sau  ");
                System.out.println("VD : 0+9 so bat ky ");

            }

        } while (true);
        do {
            System.out.println("Nhap can cuoc cong dan : ");
            String ccm = sc.nextLine();
            String checkcc = "\\d{9}";
            if (ccm.matches(checkcc)) {

                this.cccd = ccm;
                break;
            } else{
                System.out.println("Nhap 9 so thoi cha");
            
            }
        } while (true);

    }

}
