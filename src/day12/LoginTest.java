package day12;

public class LoginTest {

    public static void main(String[] args) {

        String userName = "", password = "";
        // user123, pass123
        if (userName.equals("user123") && password.equals("pass123")) {
            System.out.println(!userName.equals("user123"));
            System.out.println("Login Successful");
            if (userName.equals("user123") && password.equals("pass123")) {
                System.out.println("USERNAME NOT CORRECT");
            } else if (!userName.equals("user123") && !password.equals("pass123")) {
                System.out.println("PASSWORD NOT CORRECT");

            } else {
                System.out.println("USERNAME AND PASSWORD ARE BOTH WRONG");
            }
        }
    }
}

