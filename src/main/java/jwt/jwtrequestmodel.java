package jwt;

import java.io.Serializable;

public class jwtrequestmodel implements Serializable {
    private static final long serialVersionUID = 2636936156391265891L;
    private String username;
    private String password;

    public jwtrequestmodel() {
    }

    public jwtrequestmodel(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
