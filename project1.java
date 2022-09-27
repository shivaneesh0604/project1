import java.util.*;;

public class project1 extends login {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Do you want to login or register");

        while (true) {
            System.out.println("Press 1 for login and 2 for register");
            int check = sc.nextInt();
            if (check == 1) {
                System.out.println("enter mail and password");
                sc.nextLine();
                String mail = sc.nextLine();
                String password = sc.nextLine();
                login l = new login(mail, password);
                break;
            } else if (check == 2) {
                System.out.println("enter mail and password for registering");
                sc.nextLine();
                String mail = sc.nextLine();
                String password = sc.nextLine();
                register r = new register(mail, password);
                System.out.println("please login again");
            }
        }
    }
}