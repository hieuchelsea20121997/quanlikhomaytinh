package Model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Objects;

public class Phieu {

    private String maPhieu;
    private Timestamp thoiGianTao;
    private String nguoiTao;
    private ArrayList<ChiTietPhieu> CTPhieu;
    private double tongTien;

    public Phieu() {
    }

    public Phieu(String maPhieu, Timestamp thoiGianTao, String nguoiTao, ArrayList<ChiTietPhieu> CTPhieu, double tongTien) {
        this.maPhieu = maPhieu;
        this.thoiGianTao = thoiGianTao;
        this.nguoiTao = nguoiTao;
        this.CTPhieu = CTPhieu;
        this.tongTien = tongTien;
    }

    public Phieu(String maPhieu, Timestamp thoiGianTao, String nguoiTao, double tongTien) {
        this.maPhieu = maPhieu;
        this.thoiGianTao = thoiGianTao;
        this.nguoiTao = nguoiTao;
        this.tongTien = tongTien;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public Timestamp getThoiGianTao() {
        return thoiGianTao;
    }

    public void setThoiGianTao(Timestamp thoiGianTao) {
        this.thoiGianTao = thoiGianTao;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public ArrayList<ChiTietPhieu> getCTPhieu() {
        return CTPhieu;
    }

    public void setCTPhieu(ArrayList<ChiTietPhieu> CTPhieu) {
        this.CTPhieu = CTPhieu;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    @Override
public int hashCode() {
    final int prime = 31;
    int hash = 1;
    hash = prime * hash + Objects.hashCode(this.maPhieu);
    hash = prime * hash + Objects.hashCode(this.nguoiTao);
    hash = prime * hash + Objects.hashCode(this.thoiGianTao);
    hash = prime * hash + Objects.hashCode(this.CTPhieu);
    hash = prime * hash + Double.hashCode(this.tongTien);
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
    Phieu other = (Phieu) obj;
    return Double.compare(this.tongTien, other.tongTien) == 0
           && Objects.equals(this.maPhieu, other.maPhieu)
           && Objects.equals(this.nguoiTao, other.nguoiTao)
           && Objects.equals(this.thoiGianTao, other.thoiGianTao)
           && Objects.equals(this.CTPhieu, other.CTPhieu);
}

    @Override
    public String toString() {
        return "Phieu{" + "maPhieu=" + maPhieu + ", thoiGianTao=" + thoiGianTao + ", nguoiTao=" + nguoiTao + ", CTPhieu=" + CTPhieu + ", tongTien=" + tongTien + '}';
    }

}

