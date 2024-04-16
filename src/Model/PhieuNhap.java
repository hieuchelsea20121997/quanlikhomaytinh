package Model;

/**
 *
 * @author DELL
 */
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Objects;

public class PhieuNhap extends Phieu {

    private String nhaCungCap;

    public PhieuNhap() {
    }

    public PhieuNhap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public PhieuNhap(String nhaCungCap, String maPhieu, Timestamp thoiGianTao, String nguoiTao, ArrayList<ChiTietPhieu> CTPhieu, double tongTien) {
        super(maPhieu, thoiGianTao, nguoiTao, CTPhieu, tongTien);
        this.nhaCungCap = nhaCungCap;
    }

    private PhieuNhap(String maPhieu, Timestamp thoiGianTao, String nguoiTao, ArrayList<ChiTietPhieu> CTPhieu, double tongTien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    @Override
    public String toString() {
        return "PhieuNhap{" + "nhaCungCap=" + nhaCungCap + " maPhieu" + this.getMaPhieu() + '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = super.hashCode();
        hash = prime * hash + Objects.hashCode(this.nhaCungCap);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        PhieuNhap other = (PhieuNhap) obj;
        return Objects.equals(this.nhaCungCap, other.nhaCungCap);
    }
}

