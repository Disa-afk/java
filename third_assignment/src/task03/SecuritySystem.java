package task03;

public class SecuritySystem {

    private boolean authorized = false;

    public void authorize(String login, String password) {
        if ("admin".equals(login) && "1234".equals(password)) {
            authorized = true;
        }
    }

    public boolean isAuthorized() {
        return authorized;
    }
}
