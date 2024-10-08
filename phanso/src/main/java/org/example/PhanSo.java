package org.example;
public class PhanSo {
    private int tuSo;
    private int mauSo;

    // Constructor
    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        if (mauSo == 0) {
            throw new ArithmeticException("Mẫu số không thể bằng 0");
        }
        this.mauSo = mauSo;
        simplify();
    }

    // Getter
    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    // Phương thức cộng hai phân số
    public PhanSo congPhanSo(PhanSo ps) {
        int tuMoi = this.tuSo * ps.getMauSo() - ps.getTuSo() * this.mauSo; // sai 
        int mauMoi = this.mauSo * ps.getMauSo();
        return new PhanSo(tuMoi, mauMoi);
    }

    // Tối giản phân số
    private void simplify() {
        int ucln = gcd(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;
    }

    // Tìm ước chung lớn nhất (GCD)
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Phương thức để hiển thị phân số
    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}
