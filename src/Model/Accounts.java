package Model;

import java.util.Objects;

/**
 *
 * @author DELL
 */
public class Accounts {
    private String fullName;
    private String user;
    private String password;
    private String role;
    private int status;
    private String email;
    
    public Accounts(){
        super();
    }

    public Accounts(String fullName, String user, String password, String role, int status, String email) {
        this.fullName = fullName;
        this.user = user;
        this.password = password;
        this.role = role;
        this.status = status;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public int getStatus() {
        return status;
    }

    public String getEmail() {
        return email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
 @Override
public int hashCode() {
    final int prime = 31;
    int hash = 1;
    hash = prime * hash + Objects.hashCode(this.fullName);
    hash = prime * hash + Objects.hashCode(this.email);
    //  Muc dich de tinh một giá trị số nguyên duy nhất cho mỗi đối tượng để tối ưu hóa việc lưu trữ và truy xuất dữ liệu
    // // Chỉ sử dụng một số trường quan trọng để tính mã băm

    return hash;
}

    @Override
  public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || !(obj instanceof Accounts)) {
        return false;
    }
    Accounts other = (Accounts) obj;
    // Tiếp tục so sánh các trường dữ liệu của this và other
    return Objects.equals(this.fullName, other.fullName)
        && Objects.equals(this.user, other.user)
        && Objects.equals(this.password, other.password)
        && Objects.equals(this.role, other.role)
        && this.status == other.status
        && Objects.equals(this.email, other.email);
}
    /* Muc dich ghi de lai equal va hashCode
    Src: https://javarush.com/vi/groups/posts/vi.1340.qu-ti-cc-phng-thc-bng-v-hashcode-trong-java
    */

    @Override
    public String toString() {
        return "Account{" + "fullName=" + fullName + ", user=" + user + ", password=" + password + ", role=" + role + ", status=" + status + ", email=" + email + '}';
    }
    
}

