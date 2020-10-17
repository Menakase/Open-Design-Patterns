package chainofresponsibilitydemo;

//The Abstract Base Handler
public abstract class AuthMiddleware implements Middleware {

    private AuthMiddleware next;
    
    public AuthMiddleware linkNext(AuthMiddleware next){
        this.next = next;
        return this.next;
    }

    //method for checking logic in concrete classes
    public abstract boolean check(String userName, String password);

    //check on the next object in chain or ends chain if it's the last object in chain.
    @Override
    public boolean checkNext(String userName, String password) {
        if (next == null) {
            return true;
        }
        //pass the object to next middleware
        return next.check(userName, password);
    }

}
