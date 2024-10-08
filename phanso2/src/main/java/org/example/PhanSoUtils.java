package org.example;

public class PhanSoUtils {

    // Phương thức cộng hai phân số
    public static PhanSo congPhanSo(PhanSo ps1, PhanSo ps2) {
        int tuMoi = ps1.getTuSo() * ps2.getMauSo() + ps2.getTuSo() * ps1.getMauSo();
        int mauMoi = ps1.getMauSo() * ps2.getMauSo();
        PhanSo ketQua = new PhanSo(tuMoi, mauMoi);
        return simplify(ketQua); // Tự động tối giản phân số sau khi cộng
    }

    // Phương thức tối giản phân số
    public static PhanSo simplify(PhanSo ps) {
        int ucln = gcd(ps.getTuSo(), ps.getMauSo());
        ps.setTuSo(ps.getTuSo() / ucln);
        ps.setMauSo(ps.getMauSo() / ucln);
        return ps;
    }

    // Phương thức tìm ước chung lớn nhất (GCD)
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
