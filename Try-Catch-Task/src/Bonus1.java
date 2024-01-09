import java.util.Scanner;

public class Bonus1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String validUsername = "Coded";
        String validPassword = "Coded123";
        // We add while to true enter the loop until it breaks
        while (true) {

            try {
                System.out.println("Enter your username : ");
                String userName = scanner.nextLine();
                System.out.println("Enter your password : ");
                String passWord = scanner.nextLine();
                if (userName.equals(validUsername) && passWord.equals(validPassword)) {
                    System.out.println("Thank you.");
                    break;
                } else {
                    throw new Exception("Invalid credentials");
                }
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
        }
        scanner.close();
    }
}
