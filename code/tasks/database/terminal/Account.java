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
    public void setPassword(String value) {
        this.password = password;
    }

    //# Metode
    public boolean verifyPassword(String value) {
        return false;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String input = "password";

        MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        byte[] bytes = algorithm.digest(input.getBytes(StandardCharsets.UTF_8));

        String output = Base64.getEncoder().encodeToString(bytes);

        System.out.println(output); // XohImNooBHFR0OVvjcYpJ3NgPQ1qq73WKhHvch0VQtg=
    }

    //# Konstruktør
    public Account(String username) {
        this.username = username;
    }
}
