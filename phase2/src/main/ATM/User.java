package ATM;

/**
 * User with username and password.
 */
abstract class User {
    private final String username;
    private String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    void setPassword(String p) {
        // password should not be empty.
        if (p.equals("")) {
            System.out.println("Password should not be empty. Your password has not been changed");
        } else {
            password = p;
            System.out.println("Password is set successfully");
        }
    }
}