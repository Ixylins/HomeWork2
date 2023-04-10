public class LoginValidationException extends Exception {
    static String log = "Ixylins";

    public static <log> void validateLogin(log){
        try {
            if (log.length() > 20) throw new LoginValidationException();
        } catch (Exception e) {
            System.out.println("Incorrect login ");
        }
        boolean c = false;
        for (int i = 0; i < log.length(); i++) {
            if (log.charAt(i) == 95) c = true;
        }
        try {
            if (c == false) throw new LoginValidationException();
        } catch (Exception e) {
            System.out.println("Incorrect login ");
        }
        boolean d = false;
        for (int i = 0; i < log.length(); i++) {
            if (log.charAt(i) > 96 && log.charAt(i) < 123) d = true;
        }
        try {
            if (d == false) throw new LoginValidationException();
        } catch (Exception e) {
            System.out.println("Incorrect login ");
        }
        boolean f = false;
        for (int i = 0; i < log.length(); i++) {
            if (log.charAt(i) > 64 && log.charAt(i) < 91) f = true;
        }
        try {
            if (f == false) throw new LoginValidationException();
        } catch (Exception e) {
            System.out.println("Incorrect login ");
        }
    }
    public static Boolean isLoginValid(String log) {
        try {
            validateLogin(log);
        }
        catch (LoginValidationException e){
            return false;
        }
        return true;
    }
}