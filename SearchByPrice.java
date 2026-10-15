public class SearchByPrice {

    public static int searchByPrice(Book[] books, int count, double targetPrice) {

        int low = 0;
        int high = count - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (books[mid].price == targetPrice) {
                return mid;
            }

            if (books[mid].price < targetPrice) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Book[] books = {
                new Book(102, "Java Basics", "James", 300.0),
                new Book(101, "Data Structures", "Mark", 400.0),
                new Book(104, "Database Systems", "Raghu", 500.0),
                new Book(103, "Python Guide", "Guido", 600.0),
                new Book(105, "Computer Networks", "Andrew", 700.0)
        };

        double targetPrice = 500.0;

        System.out.println("Searching for Price Rs. " + targetPrice + "...");

        int index = searchByPrice(books, books.length, targetPrice);

        if (index != -1) {
            System.out.println("Result: Book found at index " + index + ": [" +
                    books[index].bookId + "] " +
                    books[index].title +
                    " (Rs. " +
                    books[index].price + ")");
        } else {
            System.out.println("Result: Book not found");
        }
    }
}