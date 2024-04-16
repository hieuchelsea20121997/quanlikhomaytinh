package Model;

/**
 *
 * @author DELL
 */
import java.util.Objects;

/**
 *
 * @author sinh
 */
public class ThongKeSanPham {

    private String maMay;
    private String tenMay;
    private int slNhap;
    private int slXuat;

    public ThongKeSanPham() {
    }

    public ThongKeSanPham(String maMay, String tenMay, int slNhap, int slXuat) {
        this.maMay = maMay;
        this.tenMay = tenMay;
        this.slNhap = slNhap;
        this.slXuat = slXuat;
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

    public int getSlNhap() {
        return slNhap;
    }

    public void setSlNhap(int slNhap) {
        this.slNhap = slNhap;
    }

    public int getSlXuat() {
        return slXuat;
    }

    public void setSlXuat(int slXuat) {
        this.slXuat = slXuat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maMay, tenMay, slNhap, slXuat);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ThongKeSanPham other = (ThongKeSanPham) obj;
        return slNhap == other.slNhap
                && slXuat == other.slXuat
                && Objects.equals(maMay, other.maMay)
                && Objects.equals(tenMay, other.tenMay);
    }

    @Override
    public String toString() {
        return "ThongKeSanPham{" + "maMay=" + maMay + ", tenMay=" + tenMay + ", slNhap=" + slNhap + ", slXuat=" + slXuat + '}';
    }

}
