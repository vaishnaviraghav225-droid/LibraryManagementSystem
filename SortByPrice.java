public class SortByPrice {

    public static void sortByPrice(Book[] books, int count) {

        int swaps = 0;

        for (int i = 0; i < count - 1; i++) {

            int min = i;

            for (int j = i + 1; j < count; j++) {

                if (books[j].price < books[min].price) {
                    min = j;
                }
            }

            if (min != i) {
                Book temp = books[i];
                books[i] = books[min];
                books[min] = temp;

                swaps++;
            }
        }

        System.out.println("Books Sorted by Price:");

        for (int i = 0; i < count; i++) {

            System.out.println(
                    (i + 1) + ". [" +
                            books[i].bookId + "] " +
                            books[i].title +
                            " - Rs. " +
                            books[i].price
            );
        }

        System.out.println("Total Swaps: " + swaps);
    }

    public static void main(String[] args) {

        Book[] books = {
                new Book(101, "Data Structures", "Mark", 400.0),
                new Book(102, "Java Basics", "James", 300.0),
                new Book(103, "Python Guide", "Guido", 600.0),
                new Book(104, "Database Systems", "Raghu", 500.0),
                new Book(105, "Computer Networks", "Andrew", 700.0)
        };

        sortByPrice(books, books.length);
    }
}