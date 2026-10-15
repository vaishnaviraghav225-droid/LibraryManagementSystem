public class MinBooks {

    public static int minBooksForTargetCost(Book[] books, int count, double targetCost) {

        int left = 0;
        double currentSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < count; right++) {

            currentSum += books[right].price;

            while (currentSum >= targetCost) {

                int length = right - left + 1;

                if (length < minLength) {
                    minLength = length;
                }

                currentSum -= books[left].price;
                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;
    }

    public static void main(String[] args) {

        Book[] books = {
                new Book(101, "Data Structures", "Author 1", 400),
                new Book(102, "Java Programming", "Author 2", 450),
                new Book(104, "Database Systems", "Author 3", 500),
                new Book(103, "Python Guide", "Author 4", 600),
                new Book(105, "Computer Networks", "Author 5", 700)
        };

        double targetCost = 1000.0;

        System.out.println("Finding minimum consecutive books whose total price >= Rs. " + targetCost + "...");

        int result = minBooksForTargetCost(books, books.length, targetCost);

        System.out.println();
        System.out.println("Minimum Consecutive Books Needed: " + result);
    }
}