import java.util.Scanner;
import encrypt.HashService;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter string to hash: ");
            String input = scanner.nextLine();
            
            String hash = HashService.hashString(input);
            System.out.println("SHA-256 hash: " + hash);
            
            scanner.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}