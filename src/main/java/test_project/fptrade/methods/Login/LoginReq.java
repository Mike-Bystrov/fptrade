package test_project.fptrade.methods.Login;

public class LoginReq {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public LoginReq(String user, String pass) {
        username = user;
        password = pass;
    }
}
