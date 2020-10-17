package chainofresponsibilitydemo;

import java.util.Scanner;


public class ChainofResponsibilityDemo {

    private static Scanner sc = new Scanner(System.in);
    private static DatabaseServer databaseServer;

    private static void init() {
        databaseServer = new DatabaseServer();
        databaseServer.register("thilini@gmail.com", "uwu123456");
        databaseServer.register("admin@daraz.lk", "admin123456");

        //define the required middleware for the action
        AuthMiddleware authMiddleware = new CloudflareProtectionMiddleware(5);
        authMiddleware.linkNext(new ValidationMiddleware())
                .linkNext(new UserVerifyMiddleware(databaseServer))
                .linkNext(new RoleCheckingMiddleware());

        databaseServer.setAuthMiddleware(authMiddleware);
    }

    public static void main(String[] args) {
        init();

        boolean pass;

        do {
            System.out.print("Enter Username: ");
            String userName = sc.nextLine();
            System.out.print("Enter Password: ");
            String password = sc.nextLine();
            pass = databaseServer.userLogin(userName, password);
        } while (!pass);
    }

}
