public class Book {
    private String title;
    private String author;
    private double userRating;
    private int reviews;
    private int price;
    private int year;
    private String genre;

    public Book(String title, String author, double userRating, int reviews, int price, int year, String genre) {
        this.title = title;
        this.author = author;
        this.userRating = userRating;
        this.reviews = reviews;
        this.price = price;
        this.year = year;
        this.genre = genre;
    }

    public String getTitle() { 
        return title; 
    }
    public String getAuthor() { 
        return author; 
    }
    public double getUserRating() { 
        return userRating; 
    }
    public int getReviews() { 
        return reviews; 
    }
    public int getPrice() { 
        return price; 
    }
    public int getYear() { 
        return year; 
    }
    public String getGenre() { 
        return genre; 
    }


    public void setTitle(String title) { 
        this.title = title; 
    }
    public void setAuthor(String author) { 
        this.author = author; 
    }
    public void setUserRating(double userRating) { 
        this.userRating = userRating; 
    }
    public void setReviews(int reviews) { 
        this.reviews = reviews; 
    }
    public void setPrice(int price) { 
        this.price = price; 
    }
    public void setYear(int year) { 
        this.year = year; 
    }
    public void setGenre(String genre) { 
        this.genre = genre; 
    }

    public void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Rating: " + userRating + ", Reviews: " + reviews + ", Price: $" + price + ", Year: " + year + ", Genre: " + genre);
    }
}
