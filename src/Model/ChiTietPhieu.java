package Model;

/**
 *
 * @author DELL
 */
import java.util.Objects;

public class ChiTietPhieu {

    private String maPhieu;
    private String maMay;
    private int soLuong;
    private double donGia;

    public ChiTietPhieu() {
    }

    public ChiTietPhieu(String maPhieu, String maMay, int soLuong, double donGia) {
        this.maPhieu = maPhieu;
        this.maMay = maMay;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 1;
        hash = prime * hash + Objects.hashCode(this.maPhieu);
        hash = prime * hash + Objects.hashCode(this.maMay);
        hash = prime * hash + this.soLuong;
        hash = prime * hash + Double.hashCode(this.donGia);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChiTietPhieu other = (ChiTietPhieu) obj;
        return this.soLuong == other.soLuong
                && Double.compare(this.donGia, other.donGia) == 0
                && Objects.equals(this.maPhieu, other.maPhieu)
                && Objects.equals(this.maMay, other.maMay);
    }

    @Override
    public String toString() {
        return "ChiTietPhieu{" + "maPhieu=" + maPhieu + ", maMay=" + maMay + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }

}
