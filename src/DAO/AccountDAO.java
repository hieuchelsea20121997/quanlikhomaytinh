package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Database.DatabaseUtil;
import Model.Accounts;
        
/**
 *
 * @author DELL
 */
public class AccountDAO implements DAOInterface<Accounts> {
  public static AccountDAO getInstance() {
        return new AccountDAO();
    }

    @Override
    public int insert(Accounts t) {
        int ketQua = 0;
        try {
            Connection con = DatabaseUtil.getConnection();
            String sql = "INSERT INTO tbAccounts (fullName, userName, password, role, status, email) VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            //Tạo PreparedStatement: Trong Java, sử dụng PreparedStatement cho phép chúng ta chuẩn bị một câu lệnh SQL với các tham số (placeholders) để tránh các vấn đề liên quan đến SQL injection và tăng hiệu suất của các câu lệnh SQL thực thi nhiều lần
            pst.setString(1, t.getFullName());
            pst.setString(2, t.getUser());
            pst.setString(3, t.getPassword());
            pst.setString(4, t.getRole());
            pst.setInt(5, t.getStatus());
            pst.setString(6, t.getEmail());
            //Buoc 4 thuc thi cau lenh sql
            ketQua = pst.executeUpdate();
            //Buoc 5 Xu ly
            //Buoc 6 ngat ket noi den voi co so du lieu
            DatabaseUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(Accounts t) {
        int ketQua = 0;
        try {
            Connection con = DatabaseUtil.getConnection();
            String sql = "UPDATE tbAccounts SET fullName=?, password=?, role=?, status=?, email=? WHERE userName=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getFullName());
            pst.setString(2, t.getPassword());
            pst.setString(3, t.getRole());
            pst.setInt(4, t.getStatus());
            pst.setString(6, t.getUser());
            pst.setString(5, t.getEmail());

            ketQua = pst.executeUpdate();
            DatabaseUtil.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int delete(Accounts t) {
        int ketQua = 0;
        try {
            Connection con = DatabaseUtil.getConnection();
            String sql = "DELETE FROM tbAccounts WHERE userName=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getUser());
            ketQua = pst.executeUpdate();
            DatabaseUtil.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<Accounts> selectAll() {
        ArrayList<Accounts> ketQua = new ArrayList<Accounts>();
        try {
            Connection con = DatabaseUtil.getConnection();
            String sql = "SELECT * FROM tbAccounts";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                String fullName = rs.getString("fullName");
                String userName = rs.getString("userName");
                String password = rs.getString("password");
                String role = rs.getString("role");
                int status = rs.getInt("status");
                String email = rs.getString("email");

                Accounts acc = new Accounts(fullName, userName, password, role, status,email);
                ketQua.add(acc);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public Accounts selectById(String t) {
        Accounts acc = null;
        try {
            Connection con = DatabaseUtil.getConnection();
            String sql = "SELECT * FROM Account WHERE userName=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String fullName = rs.getString("fullName");
                String userName = rs.getString("userName");
                String password = rs.getString("password");
                String role = rs.getString("role");
                int status = rs.getInt("status");
                String email = rs.getString("email");
                acc = new Accounts(fullName, userName, password, role, status,email);
            }
            DatabaseUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception           
        }
        return acc;
    }
    
        public int updatePassword(String email, String password) {
        int ketQua = 0;
        try {
            Connection con = DatabaseUtil.getConnection();
            String sql = "UPDATE tbAccounts SET password=? WHERE email=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, password);
            pst.setString(2, email);

            ketQua = pst.executeUpdate();
            DatabaseUtil.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }    
    
}
