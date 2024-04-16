package Model;

/**
 *
 * @author DELL
 */
import java.util.Objects;

/**
 *
 * @author Tran Nhat Sinh
 */
public class Laptop extends MayTinh {

    private double kichThuocMan;
    private String dungLuongPin;

    public Laptop(double kichThuocMan, String dungLuongPin, String maMay, String tenMay, int soLuong, double gia, String tenCpu, String ram, String xuatXu, String cardManHinh, String Rom, int trangThai) {
        super(maMay, tenMay, soLuong, gia, tenCpu, ram, xuatXu, cardManHinh, Rom, trangThai);
        this.kichThuocMan = kichThuocMan;
        this.dungLuongPin = dungLuongPin;
    }

    public Laptop() {

    }

    public double getkichThuocMan() {
        return kichThuocMan;
    }

    public void setkichThuocMan(double kichThuocMan) {
        this.kichThuocMan = kichThuocMan;
    }

    public String getDungLuongPin() {
        return dungLuongPin;
    }

    public void setDungLuongPin(String dungLuongPin) {
        this.dungLuongPin = dungLuongPin;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), kichThuocMan, dungLuongPin);
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
        Laptop other = (Laptop) obj;
        return Objects.equals(kichThuocMan, other.kichThuocMan)
                && Objects.equals(dungLuongPin, other.dungLuongPin);
    }

    @Override
    public String toString() {
        return "Laptop{" + "kichThuocMan=" + kichThuocMan + ", dungLuongPin=" + dungLuongPin + '}';
    }

}
