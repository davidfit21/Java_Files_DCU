 enum BookMedium {
    PhysicalBook, 
    EBook, 
    AudioBook
}

enum BookGenre {
    Fiction,
    NonFiction
}

enum BookRating {
    Rating1,
    Rating2,
    Rating3,
    Rating4,
    Rating5
}

class Book {
    // fields are private
    private String title;
    private String author;
    private int publishedDate;
    private int readDate;
    private BookMedium medium;
    private BookGenre genre;
    private BookRating rating;

    /**
     * Default constructor takes title, author, and genre
     */

     public Book(String title, String author, BookGenre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
     }

    /**
     * Additional constructor also takes published date
     */

     public Book(String title, String author, BookGenre genre, int publishedDate) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publishedDate = publishedDate;
     }

    /**
     * Additional constructor also takes published date,
     * read date, read medium, and rating
     */

     public Book(String title, String author, BookGenre genre, int publishedDate, int readDate, BookMedium medium, BookRating rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publishedDate = publishedDate;
        this.readDate = readDate;
        this.medium = medium;
        this.rating = rating;
     }

    // getters
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getPublishedDate() {
        return this.publishedDate;
    }
    public int getReadDate() {
        return this.readDate;
    }
    public BookMedium getMedium() {
        return this.medium;
    }
    public BookGenre getGenre() {
        return this.genre;
    }
    public BookRating getRating() {
        return this.rating;
    }



    // setters

    /**
     * toString implementation
     * Depends on available information
     * For title, an author, and a genre - Title by Author
     * If publication date is present - Title by Author (Year of Publication)
     * If read date, read medium, and rating is present -
     * Title by Author (Year of Publication) - read in Year of Reading, rated rating/5
     */

     public String toString() {
        String initialResult = this.title + " by " + this.author;

        if (this.publishedDate != 0) {
            initialResult += " (" + this.publishedDate + ")";
     }
 
        if (this.readDate != 0) {
         initialResult +=  " - read in " + this.readDate + ", rated " + (this.rating.ordinal()+1) + "/5";
        }
 
     return initialResult;
     }
    public static void main(String[] args) {
        Book b1 = new Book("Children of Time", "Adrian Tchaikovsky", BookGenre.Fiction);
        System.out.println(b1);
        Book b2 = new Book("The Fifth Season", "N. K. Jemesin", BookGenre.Fiction, 2015);
        System.out.println(b2);
        Book b3 = new Book("Perdido Street Station", "China Mieville",
            BookGenre.Fiction, 2000, 2020, BookMedium.EBook, BookRating.Rating5);
        System.out.println(b3);

        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getGenre());
        System.out.println(b2.getPublishedDate());
        System.out.println(b3.getReadDate());
        System.out.println(b3.getMedium());
        System.out.println(b3.getRating());
    }
}