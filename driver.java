import java.util.*;

public class driver {
    public static void main(String[] args) {
        String filePath = "bestsellers with categories.csv";
        DatasetReader reader = new DatasetReader();
        ArrayList<Book> books = reader.readBook(filePath);

        System.out.println("-----------------------------------");

        System.out.println("first 5 books");
        for (int i = 0; i < Math.min(5, books.size()); i++) {
            books.get(i).printDetails();
        }

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== MENU ======");
            System.out.println("1. Count books by an author");
            System.out.println("2. List all authors");
            System.out.println("3. Show books by an author");
            System.out.println("4. Show books with a specific rating");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter author name: ");
                    String author1 = sc.nextLine();
                    System.out.println("Total books by " + author1 + ": " + BookService.countBooksByAuthor(books, author1));
                    break;

                case 2:
                    System.out.println("\nAll Authors:");
                    for (String a : BookService.getAllAuthors(books)) {
                        System.out.println("- " + a);
                    }
                    break;

                case 3:
                    System.out.print("Enter author name: ");
                    String author2 = sc.nextLine();
                    System.out.println("\nBooks by " + author2 + ": " + BookService.getBooksByAuthor(books, author2));
                    break;

                case 4:
                    System.out.print("Enter rating: ");
                    double rating = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("\nBooks with rating " + rating + ":");
                    for (Book b : BookService.getBooksByRating(books, rating)) {
                        b.printDetails();
                    }
                    break;

                case 0:
                    System.out.println("Goodbye");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }
}