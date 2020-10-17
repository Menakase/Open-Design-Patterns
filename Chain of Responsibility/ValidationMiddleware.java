package chainofresponsibilitydemo;

public class ValidationMiddleware extends AuthMiddleware {

    @Override
    public boolean check(String userName, String password) {
        if (!userName.contains("@")) {
            System.out.println("Invalid username, please check your username");
            return false;
        }
        
        if (password.length() < 8) {
            System.out.println("Invalid password, please check your password");
            return false;
        }
        System.out.println("Input validation is successful");
        return checkNext(userName, password);
    }

}
