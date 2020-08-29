import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name for registaration");
        String name=scanner.next();
        System.out.println("Please enter your password");
        String password=scanner.next();
            FileWriter writer = new FileWriter("/Users/serra/IntelliJIDEAProjects/TrackBook/src/Accounts", true);
            writer.write(name+"|"+password+"|"+ "\n");
            writer.close();

    }
    static void login() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username to login");
        String userName=scanner.next();
        System.out.println("Please enter your password");
        String password=scanner.next();

        addBook();


    }static void addBook() throws IOException {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter book name");
        String bookName= scan.next();
        System.out.println("Please enter author of the book");
        String author= scan.next();;
        System.out.println("How many page it was?");
        int page= scan.nextInt();
        System.out.println("What was th category lastly");
        String category=scan.next();

        FileWriter writer = new FileWriter("/Users/serra/IntelliJIDEAProjects/TrackBook/src/Accounts", true);
        writer.write(bookName+"|"+author+"|"+page+"|"+category  + "\n");
        writer.close();


                }



    }
