package task03;

import java.util.Scanner;

public class BloodDBProxy implements DB {

    private final SecuritySystem security;
    private BloodDB realDB;

    public BloodDBProxy() {
        security = new SecuritySystem();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        security.authorize(login, password);
        if (security.isAuthorized()) {
            realDB = new BloodDB();
        } else {
            System.out.println("Access denied");
        }
    }

    @Override
    public BloodSample getById(int id) {
        if (security.isAuthorized()) {
            return realDB.getById(id);
        }
        return new BloodSample(0, "access", "denied", null, null, null);
    }
}
