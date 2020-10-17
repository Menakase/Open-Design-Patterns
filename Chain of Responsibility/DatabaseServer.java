package chainofresponsibilitydemo;

import java.util.HashMap;
import java.util.Map;

public class DatabaseServer {

    private Map<String, String> users = new HashMap<>();
    private AuthMiddleware authMiddleware;

    public void setAuthMiddleware(AuthMiddleware authMiddleware) {
        this.authMiddleware = authMiddleware;
    }

    public boolean userLogin(String userName, String password) {
        if (authMiddleware.check(userName, password)) {
            System.out.println("User authorization have been successful!");
            return true;
        }
        return false;
    }

    public void register(String userName, String password) {
        users.put(userName, password);
    }

    public boolean hasUserName(String userName) {
        return users.containsKey(userName);
    }

    public boolean validPassword(String userName, String password) {
        return users.get(userName).equals(password);
    }

}
