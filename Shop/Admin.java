package Shop;

import java.time.LocalDateTime;
import java.util.List;

public class Admin {

    // Attributes
    private int adminId;
    private String adminName;
    private String email;
    private String password;  // In a production app, use secure password handling
    private String adminLevel; // e.g., "super", "manager", etc.
    private LocalDateTime lastLoginTime;
    private List<String> permissions; // e.g., "MANAGE_ORDERS", "UPDATE_MENU"


    // Constructor
    public Admin(int adminId, String username, String email, String password, String adminLevel, List<String> permissions) {
        this.adminId = adminId;
        this.adminName = username;
        this.email = email;
        this.password = password;
        this.adminLevel = adminLevel;
        this.permissions = permissions;
    }

    // Getters

    public int getAdminId() {
        return adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
        return password;
    }

    public String getAdminLevel() {
        return adminLevel;
    }

    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

    public List<String> getPermission(){
        return permissions;
    }

    // Setters

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public void setAdminName(String username) {
        this.adminName = username;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {

        this.password = password;
    }


    public void setAdminLevel(String adminLevel) {
        this.adminLevel = adminLevel;
    }

    public void setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public void setPermission(List<String> permissions) {
        this.permissions = permissions;
    }
}
