package Model;

import java.util.Objects;

/**
 *
 * @author Tran Nhat Sinh
 */
public class MayTinhBan extends MayTinh {

    private String mainBoard;
    private int congSuatNguon;

    public MayTinhBan(String mainBoard, int congSuatNguon) {
        this.mainBoard = mainBoard;
        this.congSuatNguon = congSuatNguon;
    }

    public MayTinhBan(String mainBoard, int congSuatNguon, String maMay, String tenMay, int soLuong, double gia, String tenCpu, String ram, String xuatXu, String cardManHinh, String Rom, int trangThai) {
        super(maMay, tenMay, soLuong, gia, tenCpu, ram, xuatXu, cardManHinh, Rom, trangThai);
        this.mainBoard = mainBoard;
        this.congSuatNguon = congSuatNguon;
    }

    public MayTinhBan() {

    }

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public int getCongSuatNguon() {
        return congSuatNguon;
    }

    public void setCongSuatNguon(int congSuatNguon) {
        this.congSuatNguon = congSuatNguon;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mainBoard, congSuatNguon);
    }

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
        MayTinhBan other = (MayTinhBan) obj;
        return Objects.equals(mainBoard, other.mainBoard)
                && Objects.equals(congSuatNguon, other.congSuatNguon);
    }

    @Override
    public String toString() {
        return "MayTinhBan{" + "mainBoard=" + mainBoard + ", congSuatNguon=" + congSuatNguon + '}';
    }

}
