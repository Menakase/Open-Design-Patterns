package chainofresponsibilitydemo;

public class CloudflareProtectionMiddleware extends AuthMiddleware {

    private int requestPerMinute;
    private long currentTime;
    private int request;

    public CloudflareProtectionMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    @Override
    public boolean check(String userName, String password) {
        if (System.currentTimeMillis() > currentTime + 60000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;

        if (request > requestPerMinute) {
            System.out.println("Please solve the Google reCAPTCHA");
            Thread.currentThread().stop();
        }
        return checkNext(userName, password);
    }

}
