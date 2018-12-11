package dayFive;

public class Login {

    private String email;
    private String pass;
    private String emailInput;
    private String passInput;
    private String submitButton;
    private String loginButton;

    String loginButton(String loginButton) {
        return this.loginButton = loginButton;
    }

    String loginEmail(String email) {
        return this.email = email;
    }

    String loginPassword(String pass) {
        return this.pass = pass;
    }

    String emailInput(String emailInput) {
        return this.emailInput = emailInput;
    }

    String passInput(String passInput) {
        return this.passInput = passInput;
    }

    String submit(String submitButton) {
        return this.submitButton = submitButton;
    }

}