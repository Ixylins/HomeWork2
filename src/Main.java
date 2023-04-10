public class Main {
    public static void main(String[] args) {
        LoginValidationException log = new LoginValidationException();
        boolean TrueLog = log.isLoginValid("1xylins");
        if (TrueLog) System.out.println("Correct login");
        else System.out.println("Incorrect login");
    }
}