import java.util.Scanner;

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String str) {
        super(str);
    }
}

public class PasswordValidation {

    static boolean validatePassword(String password) {
        int len;
        len = password.length();

        int numberCount = 0;
        int specialCharCount = 0;

        char charArray[] = password.toCharArray();

        for(int i = 0; i < len; i++) {
            char c = charArray[i];
            if(c >= '0' && c <= '9') {
                numberCount++;
            }
            if((c >= 32 && c <= 47) || (c >= 58 && c <= 64) || (c >= 91 && c <= 96) || (c >= 123 && c <= 126)) {
                specialCharCount++;
            }
        }


        if(len < 8 || numberCount == 0 || specialCharCount == 0) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) throws InvalidPasswordException {
        String loginId;
        String password;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter loginId : ");
        loginId = input.next();
        System.out.println("Enter Password : ");
        password = input.next();

        if(validatePassword(password)) {
            System.out.println("Login Successful!");
        } else {
            throw new InvalidPasswordException("Please enter valid password of length 8 containing one digit and one Special Symbol");
        }
    }
}
