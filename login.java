public class login extends credentials {
    credentials c = new credentials();

    login() {
    }

    login(String mail, String password) {
        if (c.mail.contains(mail) && c.password.contains(password)) {
            System.out.println("loged in");
        } else {
            System.out.println("wrong password");
        }
    }
}
