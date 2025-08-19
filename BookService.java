import java.util.*;

public class BookService {

    public static int countBooksByAuthor(ArrayList<Book> books, String author) {
        int count = 0;
        for (Book b : books) {
            if (b.getAuthor().equals(author)) {
                count++;
            }
        }
        return count;
    }

    public static HashSet<String> getAllAuthors(ArrayList<Book> books) {
        HashSet<String> authors = new HashSet<>();
        for (Book b : books) {
            authors.add(b.getAuthor());
        }
        return authors;
    }

    public static ArrayList<String> getBooksByAuthor(ArrayList<Book> books, String author) {
        ArrayList<String> result = new ArrayList<>();
        for (Book b : books) {
            if (b.getAuthor().equals(author)) {
                result.add(b.getTitle());
            }
        }
        return result;
    }

    public static ArrayList<Book> getBooksByRating(ArrayList<Book> books, double rating) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book b : books) {
            if (b.getUserRating() == rating) {
                result.add(b);
            }
        }
        return result;
    }

    public static ArrayList<Book> getTopRatedBooks(ArrayList<Book> books, int n) {
        ArrayList<Book> sortedBooks = new ArrayList<>(books);

        Collections.sort(sortedBooks, (b1, b2) -> Double.compare(b2.getUserRating(), b1.getUserRating()));

        ArrayList<Book> result = new ArrayList<>();
        for (int i = 0; i < n && i < sortedBooks.size(); i++) {
            result.add(sortedBooks.get(i));
        }
        return result;
    }


    public static ArrayList<Book> getBooksByYear(ArrayList<Book> books, int year) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book b : books) {
            if (b.getYear() == year) {
                result.add(b);
            }
        }
        return result;
    }
}
