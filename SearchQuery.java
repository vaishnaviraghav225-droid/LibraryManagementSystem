public class SearchQuery {

    public static void searchBooks(Book[] books, int n, String query) {

        System.out.println("Search Results for '" + query + "':");

        for (int i = 0; i < n; i++) {

            if (books[i].title.toLowerCase().contains(query.toLowerCase())) {

                System.out.println("- Found: [" +
                        books[i].bookId + "] " +
                        books[i].title +
                        " (Rs. " + books[i].price + ")");
            }
        }
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

        searchBooks(books, books.length, "data");
    }
}