package tasks.database.terminal;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Password {
    //# Metoder
    public static String hash(String input) throws NoSuchAlgorithmException {

        MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        byte[] bytes = algorithm.digest(input.getBytes(StandardCharsets.UTF_8));

        String output = Base64.getEncoder().encodeToString(bytes);

        return output;
    }
}
