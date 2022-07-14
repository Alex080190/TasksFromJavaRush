package Functions;

public class WelcomeButNotForEveryone {
    public static void main(String[] args) {

    }

    public static void signIn(String username) {

        if (username.equals("user")) {
            return;
        }
        System.out.println("Добро пожаловать " + username);
        System.out.println("Очень скучали по Вам, " + username);
    }
}
