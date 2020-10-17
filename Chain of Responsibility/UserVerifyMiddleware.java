package chainofresponsibilitydemo;

public class UserVerifyMiddleware extends AuthMiddleware{
    private DatabaseServer databaseServer;

    public UserVerifyMiddleware(DatabaseServer databaseServer) {
        this.databaseServer = databaseServer;
    }
    
    @Override
    public boolean check(String userName, String password) {
        if(!databaseServer.hasUserName(userName)){
            System.out.println("Username does not extits in records");
            return false;
        }
        
        if(!databaseServer.validPassword(userName, password)){
            System.out.println("Invalid Password or Username");
            return false;
        }
        
        return checkNext(userName, password);
    }
    
}
