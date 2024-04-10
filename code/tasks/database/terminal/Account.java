package tasks.database.terminal;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Account {
    //# Fields
    private final String username;
    private String password;

    //# Getter metoder
    public String getName() {
        return username;
    }

    //# Setter metoder
    public void setPassword(String value) throws NoSuchAlgorithmException {
        this.password = Password.hash(value);
    }

    //# Metode
    public boolean verifyPassword(String value) {
        return false;
    }

    //# Konstruktør
    public Account(String username, String password) throws NoSuchAlgorithmException {
        this.username = username;
        setPassword(password);
    }
}
