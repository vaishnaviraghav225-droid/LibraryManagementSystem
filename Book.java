public class Book {

    int bookId;
    String title;
    String author;
    double price;


    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public static int removeDuplicates(Book[] books, int n) {

        if (n == 0) {
            return 0;
        }

        int j = 0;

        for (int i = 1; i < n; i++) {

            if (books[i].bookId != books[j].bookId) {
                j++;
                books[j] = books[i];
            }
        }

        return j + 1;
    }

    public static void main(String[] args) {

        Book[] books = {
                new Book(101, "Data Structures", "Mark", 400.0),
                new Book(101, "Data Structures", "Mark", 400.0),
                new Book(102, "Java Basics", "James", 300.0),
                new Book(103, "Python Guide", "Guido", 600.0),
                new Book(104, "Database Systems", "Raghu", 500.0),
                new Book(105, "Computer Networks", "Andrew", 700.0)
        };

        int n = books.length;

        int m = removeDuplicates(books, n);

        System.out.println("Unique Books: " + m);

        for (int i = 0; i < m; i++) {
            System.out.println(
                    books[i].bookId + " | " +
                            books[i].title + " | " +
                            books[i].author + " | " +
                            books[i].price
            );
        }
    }
}