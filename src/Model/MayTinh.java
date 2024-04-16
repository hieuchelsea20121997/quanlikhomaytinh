package Model;

/**
 *
 * @author DELL
 */
import java.util.Objects;

public class MayTinh {

    private String maMay;
    private String tenMay;
    private int soLuong;
    private double gia;
    private String tenCpu;
    private String ram;
    private String xuatXu;
    private String cardManHinh;
    private String Rom;
    private int trangThai;

    public MayTinh() {

    }

    public MayTinh(String maMay, String tenMay, int soLuong, double donGia, String boXuLi, String loaiMay, int trangThai) {

    }

    public MayTinh(String maMay, String tenMay, int soLuong, double gia, String tenCpu, String ram, String xuatXu, String cardManHinh, String Rom, int trangThai) {
        this.maMay = maMay;
        this.tenMay = tenMay;
        this.soLuong = soLuong;
        this.gia = gia;
        this.tenCpu = tenCpu;
        this.ram = ram;
        this.xuatXu = xuatXu;
        this.cardManHinh = cardManHinh;
        this.Rom = Rom;
        this.trangThai = trangThai;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public MayTinh(String maMay, String tenMay, int soLuong, double gia, String tenCpu, String ram, String Rom) {
        this.maMay = maMay;
        this.tenMay = tenMay;
        this.soLuong = soLuong;
        this.gia = gia;
        this.tenCpu = tenCpu;
        this.ram = ram;
        this.Rom = Rom;
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getTenMay() {
        return tenMay;
    }

    public void setTenMay(String tenMay) {
        this.tenMay = tenMay;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getTenCpu() {
        return tenCpu;
    }

    public void setTenCpu(String tenCpu) {
        this.tenCpu = tenCpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getCardManHinh() {
        return cardManHinh;
    }

    public void setCardManHinh(String cardManHinh) {
        this.cardManHinh = cardManHinh;
    }

    public String getRom() {
        return Rom;
    }

    public void setRom(String Rom) {
        this.Rom = Rom;
    }

    public void xuatHang(int sl) {
        this.soLuong -= sl;
    }

    @Override
    public String toString() {
        return "MayTinh{" + "maMay=" + maMay + ", tenMay=" + tenMay + ", soLuong=" + soLuong + ", gia=" + gia + ", tenCpu=" + tenCpu + ", ram=" + ram + ", xuatXu=" + xuatXu + ", cardManHinh=" + cardManHinh + ", Rom=" + Rom + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(maMay, tenMay, soLuong, gia, tenCpu, ram, xuatXu, cardManHinh, Rom);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MayTinh other = (MayTinh) obj;
        return soLuong == other.soLuong
                && Double.compare(other.gia, gia) == 0
                && Objects.equals(maMay, other.maMay)
                && Objects.equals(tenMay, other.tenMay)
                && Objects.equals(tenCpu, other.tenCpu)
                && Objects.equals(ram, other.ram)
                && Objects.equals(xuatXu, other.xuatXu)
                && Objects.equals(cardManHinh, other.cardManHinh)
                && Objects.equals(Rom, other.Rom);
    }
}
