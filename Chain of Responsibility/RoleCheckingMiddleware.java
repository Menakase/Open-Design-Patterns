package chainofresponsibilitydemo;

public class RoleCheckingMiddleware extends AuthMiddleware{

    @Override
    public boolean check(String userName, String password) {
        if(userName.equals("admin@daraz.lk")){
            System.out.println("Redirecting to admin panel");
            return true;
        }
        
        System.out.println("Redirecting to user dashboard");
        return checkNext(userName, password);
    }
    
}
