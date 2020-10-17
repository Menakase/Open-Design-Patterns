package chainofresponsibilitydemo;

//Handler Interface
public interface Middleware {

    public boolean checkNext(String userName, String password);
}
