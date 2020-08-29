import java.io.IOException;
import java.util.Scanner;

public class HomePage {



    static void showMenu() throws IOException {
    Scanner scan = new Scanner(System.in);

        System.out.println("*************************************");
        System.out.println("Welcome to read book tracking system");
        System.out.println("Choose operation to go further");
        System.out.println("*******************************");
    String menus = "1-Register \n" + "2-Login To System\n" + "3-Quit(press  Q for quit)";
    //     + "4-See Books List\n" + "5-Rent Book\n" + "6-Hand In Book\n" + "7-Quit(press  Q for quit)";
        System.out.println(menus);


        while (true) {
        System.out.println("Choose operation");
        String islem = scan.nextLine();

        if (islem.equals("1")) {
          Book.createUser();
        }  else if (islem.equals("2")) {
            System.out.println("Already an user ..?Please log in!");
          Book.login();
        }
            if (islem.equals("Q")) {
                System.out.println("Logging out for you");
                //System.exit();
                break;
            } else {
                System.out.println("undefined operation");
            }

        }
    }
}
