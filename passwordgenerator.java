import java.util.*;
import java.util.Scanner;
public class passwordgenerator {
    public static void main(String[] args) {
        Scanner scs = new Scanner(System.in);
        System.out.println("Enter the desired password length:");
        int length = scs.nextInt();
        System.out.println("Enter the desired password complexity (1-3):");
        int complexity = scs.nextInt();
        String password = generatePassword(length, complexity);
        System.out.println("Your password is: " + password);
    }
    private static String generatePassword(int length, int complexity) {
        // Create a string of all possible characters
        String characters = "abcdefghijklmnopqrstuvwxyz!@#$%^&*0123456789!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ()";
        Random random = new Random();
        StringBuffer password = new StringBuffer();
        // Generate a random password based on the user's criteria
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char character = characters.charAt(index);
            password.append(character);
        }
        // Return the generated password
        return password.toString();
}
}