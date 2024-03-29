package Mini_project;

public class User {
    private String username; //here we perform encapsulation making private fields and perform implemeton 
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() { //achieve encapsulation here to access these 
        return username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password); 
    }
}
