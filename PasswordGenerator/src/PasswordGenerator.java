import java.util.Random;

/**
 * The password we are generating will change every time.
 * As we have used the Random() method to generate the password.
 */

public class PasswordGenerator {



    public static void main(String[] args) {
        int length = 10;
        System.out.println(geek_Password(length));
    }

    static char[] geek_Password(int len) {
        System.out.println("Generating password using random");
        System.out.println("Your new password is: ");
        String capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "*!@#$%^&*()_+=/.?<>";
        String values = capital_chars + small_chars + numbers + symbols;
        Random rndm_method = new Random();
        char[] password = new char[len];
        for (int i = 0; i < len; i++) {
            password[i] = values.charAt( rndm_method.nextInt(values.length()));
        }
        return password;
    }
}
