package Model;

/**
 *
 * @author DELL
 */
import java.sql.Timestamp;
import java.util.ArrayList;
    
public class PhieuXuat extends Phieu{

    public PhieuXuat() {
    }  

    public PhieuXuat(String maPhieu, Timestamp thoiGianTao, String nguoiTao, ArrayList<ChiTietPhieu> CTPhieu, double tongTien) {
        super(maPhieu, thoiGianTao, nguoiTao, CTPhieu, tongTien);
    }
}
