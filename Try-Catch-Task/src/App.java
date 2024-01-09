import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String validUsername = "Coded";
        String validPassword = "Coded123";

        try {
            System.out.println("Enter your UserName : ");
            String userName = scanner.nextLine();
            System.out.println("Enter your PassWord : ");
            String passWord = scanner.nextLine();
            if (userName.equals(validUsername) && passWord.equals(validPassword)) {
                System.out.println("Thank you.");

            } else {
                throw new Exception("Invalid credentials");
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        scanner.close();
    }
}