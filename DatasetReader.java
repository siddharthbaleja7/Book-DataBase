import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class DatasetReader {

    public static ArrayList<Book> readBook(String filePath) {
        ArrayList<Book> books = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            boolean firstLine = true;

            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }

                String[] values = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

                if (values.length == 7) {
                    try {
                        String title = values[0].replace("\"", "");
                        String author = values[1];
                        double rating = Double.parseDouble(values[2]);
                        int reviews = Integer.parseInt(values[3]);
                        int price = Integer.parseInt(values[4]);
                        int year = Integer.parseInt(values[5]);
                        String genre = values[6];

                        Book book = new Book(title, author, rating, reviews, price, year, genre);
                        books.add(book);
                    } catch (NumberFormatException e) {
                        System.out.println("Skipping error line: " + line);
                    }
                }
            }

            br.close();
        } catch (Exception e) {
            System.out.println("Error Occured" + e.getMessage());
        }

        return books;
    }
}
