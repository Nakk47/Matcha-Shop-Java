package User_Account;

public class User {
    private int id;
    private String username;
    private String email;
    private String password;  // In a real application, consider using secure password handling

    // Constructor
    public User(int id, String username, String email, String password, String role) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Getters
    public int getId() {
        return id;
    }

    
    public String getUsername() {
        return username;
    }
    
    
    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
        return password;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setPassword(String password) {
        this.password = password;
    }




}