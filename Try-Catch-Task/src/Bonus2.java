import java.util.Scanner;

public class Bonus2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String validUsername = "Coded";
        String validPassword = "Coded123";
        // We add for to decrease the limits for entering the password
        for (int i = 5; i > 0; i--) {

            try {
                System.out.println("Enter your username : ");
                String userName = scanner.nextLine();
                System.out.println("Enter your password : ");
                String passWord = scanner.nextLine();
                if (userName.equals(validUsername) && passWord.equals(validPassword)) {
                    System.out.println("Thank you.");

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
