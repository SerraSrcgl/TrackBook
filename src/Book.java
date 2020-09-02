import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Book {

    public String name;
    public String author;
    public int numberOfPages;
    public String category;

    public Book(String name, String author, int numberOfPages, String category) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.category = category;
    }

    public Book(int id, String name, String surname, String email, String password) {

    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getCategory() {
        return category;
    }


//     class Book implements Set<Book> {
//        private Set<Book> persons = new HashSet<Book>();
//
//        public boolean add(Book person) {
//            return persons.add(person);
//        }

    static void createUser() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name for registaration");
        String name = scanner.next();
        System.out.println("Please enter your password");
        String password = scanner.next();
        FileWriter writer = new FileWriter("/Users/serra/IntelliJIDEAProjects/TrackBook/src/Accounts", true);
        writer.write(name + "|" + password + "|" + "\n");
        writer.close();


    }

    static void login() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username to login");
        String userName = scanner.next();
        System.out.println("Please enter your password");
        String password = scanner.next();

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/serra/IntelliJIDEAProjects/TrackBook/src/RegisteredUser"))) {
            String line;
            boolean nameAndPass = false;
            boolean name = false;
            boolean Pass = false;

            while ((line = br.readLine()) != null) {

                String[] values = line.split(" ");
                //records.add(values[0]);
                //records.add(values[1]);
                String user_name = values[0];
                String password_ = values[1];


                //  md5(password_);
//                int count=3;
//                while (count<3) {


                if (userName.equals(user_name) && (password_).equals(password)) {
                    nameAndPass = true;

                } else if (!userName.equals(user_name) && (password_).equals(password)) {
                    Pass = true;
                } else if (userName.equals(user_name) && !(password_).equals(password)) {
                    name = true;
                }
            }

            if (nameAndPass) {
                System.out.println("You successfully logged in");

                addBook();


            }
        }
    }

    static void addBook() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter book name");
        String bookName = scan.next();
        System.out.println("Please enter author of the book");
        String author = scan.next();
        ;
        System.out.println("How many page it was?");
        int page = scan.nextInt();
        System.out.println("What was th category lastly");
        String category = scan.next();

        FileWriter writer = new FileWriter("/Users/serra/IntelliJIDEAProjects/TrackBook/src/Accounts", true);
        writer.write(bookName + "|" + author + "|" + page + "|" + category + "\n");
        writer.close();


    }
}
