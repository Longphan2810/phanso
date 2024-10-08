package org.example;
public class PhanSo {
    private int tuSo;
    private int mauSo;

    // Constructor
    public PhanSo(int tuSo, int mauSo) {
        if (mauSo == 0) {
            throw new ArithmeticException("Mẫu số không thể bằng 0");
        }
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    // Getter và Setter
    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    // Phương thức để hiển thị phân số
    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}

